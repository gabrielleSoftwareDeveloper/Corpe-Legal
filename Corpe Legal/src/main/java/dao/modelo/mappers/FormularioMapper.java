package dao.modelo.mappers;

import dao.modelo.CasoEntity;
import dao.modelo.ClienteEntity;
import domain.model.Formulario;
import jakarta.inject.Inject;

public class FormularioMapper {
    @Inject
    public FormularioMapper() {
    }

  /*  public CasoEntity toCasoEntity(Formulario formulario){
        return new CasoEntity(formulario.getObservaciones(),formulario.getDocumentos());
    }

    public ClienteEntity toClienteEntity(Formulario formulario){
        return new ClienteEntity(formulario.getTelefono(), formulario.getEmail(), formulario.getNombre_apellidos());
    }*/
}
