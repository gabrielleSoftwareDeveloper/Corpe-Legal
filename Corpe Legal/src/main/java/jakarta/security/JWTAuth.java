package jakarta.security;
import io.jsonwebtoken.ExpiredJwtException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.security.enterprise.AuthenticationStatus;
import jakarta.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;
import jakarta.security.enterprise.authentication.mechanism.http.HttpMessageContext;
import jakarta.security.enterprise.credential.BasicAuthenticationCredential;
import jakarta.security.enterprise.credential.RememberMeCredential;
import jakarta.security.enterprise.identitystore.CredentialValidationResult;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.core.HttpHeaders;
import java.io.IOException;
import static common.Cons.*;

/*
@ApplicationScoped
public class JWTAuth implements HttpAuthenticationMechanism {


    private final BasicIdentityStore identity;
    private final BearerIdentityStore bearerIdentityStore;
    private final ServiciosLogin serviciosLogin;

    @Inject
    public JWTAuth(BasicIdentityStore identity, BearerIdentityStore bearerIdentityStore, ServiciosLogin serviciosLogin) {
        this.identity = identity;
        this.bearerIdentityStore = bearerIdentityStore;
        this.serviciosLogin = serviciosLogin;
    }

    @Override
    public AuthenticationStatus validateRequest(HttpServletRequest request, HttpServletResponse response, HttpMessageContext httpMessageContext) {
        CredentialValidationResult result = null;
        String header = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (header != null) {
            String[] parts = header.split(REGEX);
            if (parts[0].equalsIgnoreCase(BASIC)) {
                result = identity.validate(new BasicAuthenticationCredential(parts[1]));
                if (result.getStatus() == CredentialValidationResult.Status.VALID) {
                    String jws1 = serviciosLogin.crearToken(new Login(result.getCallerPrincipal().getName(), null, result.getCallerGroups().stream().findFirst().get()));
                    response.addHeader(HttpHeaders.AUTHORIZATION, BEARER + REGEX + jws1);
                }
            } else if (parts[0].equalsIgnoreCase(BEARER)) {
                try {
                    result = bearerIdentityStore.validate(new RememberMeCredential(parts[1]));
                } catch (ExpiredJwtException e) {
                    try {
                        response.sendError(498);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            } else {
                return httpMessageContext.doNothing();
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
*/