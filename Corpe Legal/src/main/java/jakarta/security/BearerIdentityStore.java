package jakarta.security;

import common.Cons;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.security.enterprise.credential.Credential;
import jakarta.security.enterprise.credential.RememberMeCredential;
import jakarta.security.enterprise.identitystore.CredentialValidationResult;
import jakarta.security.enterprise.identitystore.IdentityStore;

import java.util.Set;


@Singleton
public class BearerIdentityStore implements IdentityStore {
    /*
    private final ServiciosLogin servicesLogin;

    @Inject
    public BearerIdentityStore(ServiciosLogin servicesLogin) {
        this.servicesLogin = servicesLogin;
    }


    @Override
    public CredentialValidationResult validate(Credential credential) {
        CredentialValidationResult result = CredentialValidationResult.INVALID_RESULT;
        RememberMeCredential user = (RememberMeCredential) credential;
        try {
            Claims claims = servicesLogin.validateToken(user.getToken());
            result = new CredentialValidationResult(claims.get(Cons.USER).toString(), Set.of(claims.get(Cons.ROLES).toString()));
        } catch (ExpiredJwtException e) {
            throw e;
        } catch (Exception e) {
            return CredentialValidationResult.NOT_VALIDATED_RESULT;
        }
        return result;

    }
*/
}
