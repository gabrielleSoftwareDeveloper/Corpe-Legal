package jakarta.rest;


import jakarta.annotation.security.DeclareRoles;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import static common.Cons.API_RUTA;
import static common.Cons.USER;

@ApplicationPath(API_RUTA)
@DeclareRoles({"admin", USER })
public class JAXRSApplication extends Application {}
