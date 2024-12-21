package dao.modelo.mappers;


import dao.modelo.UsuarioEntity;
import domain.model.Usuario;
import domain.model.enums.Permiso;
import jakarta.inject.Inject;

public class UsuarioMapper {


    private final CasoMapper casoMapper;

    @Inject
    public UsuarioMapper(CasoMapper casoMapper) {
        this.casoMapper = casoMapper;
    }


    public UsuarioEntity toUsuarioEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.getId(), usuario.getNombre_apellidos(), usuario.getRol().toString(),
                usuario.getCasos().stream().map(casoMapper::toCasoEntity).toList());
    }

    public Usuario toUsuario(UsuarioEntity usuarioEntity) {
        return new Usuario(usuarioEntity.getId(), usuarioEntity.getNombre_apellidos(),
                Permiso.valueOf(usuarioEntity.getRol()), usuarioEntity.getCasos()
                .stream().map(casoMapper::toCaso).toList());
    }
}