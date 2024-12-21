package jakarta.rest;

import domain.model.Caso;
import domain.model.Usuario;
import domain.services.impl.CasoServiceImpl;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import static common.Cons.ID;
import static common.Cons.ID_RUTA;

@Path("/caso")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CasoRest {

    private final CasoServiceImpl casoServiceImpl;

    @Inject
    public CasoRest(CasoServiceImpl casoServiceImpl) {
        this.casoServiceImpl = casoServiceImpl;
    }

    @GET
    @Path(ID_RUTA)
    public Caso getCaso(@PathParam(ID) int id) {
        return casoServiceImpl.getCaso(id);
    }
}
