package jakarta.rest;


import jakarta.annotation.security.DeclareRoles;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import static common.Cons.API_RUTA;

@ApplicationPath(API_RUTA)
@DeclareRoles({"ABOGADO", "COMERCIAL", "ADMINISTRADOR", "CONTABLE"})
public class JAXRSApplication extends Application {}
