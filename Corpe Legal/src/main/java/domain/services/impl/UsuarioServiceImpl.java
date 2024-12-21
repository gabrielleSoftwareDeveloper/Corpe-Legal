package domain.services.impl;

import dao.impl.DaoUsuarioImpl;
import domain.model.Usuario;
import jakarta.inject.Inject;

public class UsuarioServiceImpl {

    private DaoUsuarioImpl daoUsuario;

    @Inject
    public UsuarioServiceImpl(DaoUsuarioImpl daoUsuario) {
        this.daoUsuario = daoUsuario;
    }

    public Usuario getUsuario(int id) {
        return daoUsuario.getUsuario(id);
    }
}
