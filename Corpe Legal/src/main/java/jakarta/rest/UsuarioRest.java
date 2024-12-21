package jakarta.rest;

import domain.model.Usuario;
import domain.services.impl.UsuarioServiceImpl;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import static common.Cons.ID;
import static common.Cons.ID_RUTA;

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioRest {

    private final UsuarioServiceImpl usuarioServiceImpl;

    @Inject
    public UsuarioRest(UsuarioServiceImpl usuarioServiceImpl) {
        this.usuarioServiceImpl = usuarioServiceImpl;
    }


    @GET
    @Path(ID_RUTA)
    public Usuario getUsuario(@PathParam(ID) int id) {
        return usuarioServiceImpl.getUsuario(id);
    }
}
