package jakarta.security;

import config.Config;
import domain.errores.OtraException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.security.enterprise.AuthenticationStatus;
import jakarta.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;
import jakarta.security.enterprise.authentication.mechanism.http.HttpMessageContext;
import jakarta.security.enterprise.credential.BasicAuthenticationCredential;
import jakarta.security.enterprise.identitystore.CredentialValidationResult;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.core.HttpHeaders;

import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static common.Cons.*;


@ApplicationScoped

public class JWTAuth implements HttpAuthenticationMechanism {

    private final BDIdentityStore identity;

    private final Config config;

    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS512);

    @Inject
    public JWTAuth(Config config, BDIdentityStore identity) {
        this.config = config;
        this.identity = identity;
    }

    @Override
    public AuthenticationStatus validateRequest(HttpServletRequest request, HttpServletResponse response, HttpMessageContext httpMessageContext) {
        CredentialValidationResult result = CredentialValidationResult.INVALID_RESULT;
        String header = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (header != null) {
            String[] parts = header.split(REGEX);
            if (parts[0].equalsIgnoreCase(BASIC)) {
                result = identity.validate(new BasicAuthenticationCredential(parts[1]));
                if (result.getStatus() == CredentialValidationResult.Status.VALID) {
                    try {
                        String jws = Jwts.builder()
                                .setSubject(SERVER)
                                .setIssuer(YO)
                                .setExpiration(Date.from(LocalDateTime.now().plusMinutes(config.getTime()).atZone(ZoneId.systemDefault()).toInstant()))
                                .claim(USER, result.getCallerPrincipal().getName())
                                .claim(ROLES, result.getCallerGroups())
                                .signWith(key).compact();
                        response.addHeader(HttpHeaders.AUTHORIZATION, BEARER + REGEX + jws);
                    } catch (Exception e) {
                        throw new OtraException("Error al generar el token");
                    }
                }
            } else if (parts[0].equalsIgnoreCase(BEARER)) {
                Jws<Claims> jws = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(parts[1]);
                List<String> roles = jws.getBody().get(ROLES, List.class);
                Set<String> rolesSet = new HashSet<>(roles);
                String user = jws.getBody().get(USER, String.class);
                result = new CredentialValidationResult(user, rolesSet);
            }
        } else {
            result = CredentialValidationResult.NOT_VALIDATED_RESULT;
        }
        if (!result.getStatus().equals(CredentialValidationResult.Status.VALID)) {
            return httpMessageContext.doNothing();
        }
        return httpMessageContext.notifyContainerAboutLogin(result);
    }
}
