package jakarta.security;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.security.enterprise.credential.BasicAuthenticationCredential;
import jakarta.security.enterprise.credential.Credential;
import jakarta.security.enterprise.identitystore.CredentialValidationResult;
import jakarta.security.enterprise.identitystore.IdentityStore;


import java.util.Set;


@Singleton
public class BasicIdentityStore implements IdentityStore {

   /* private final ServiciosLogin servicesLogin;

    @Inject
    public BasicIdentityStore(ServiciosLogin servicesLogin) {
        this.servicesLogin = servicesLogin;
    }


    @Override
    public CredentialValidationResult validate(Credential credential) {
        CredentialValidationResult result = CredentialValidationResult.INVALID_RESULT;
        BasicAuthenticationCredential user = (BasicAuthenticationCredential) credential;
        Login username = null;
        try {
            username = servicesLogin.login(new Login(user.getCaller(), String.valueOf(user.getPassword().getValue())));
        } catch (Exception e) {
            return CredentialValidationResult.NOT_VALIDATED_RESULT;
        }
        if (username != null) {
            result = new CredentialValidationResult(username.getUser(), Set.of(username.getRol()));
        }
        return result;

    }*/

}
