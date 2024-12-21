package dao.impl;

import dao.hibernate.JPAUtil;
import dao.modelo.UsuarioEntity;
import dao.modelo.mappers.UsuarioMapper;
import domain.model.Usuario;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class DaoUsuarioImpl {
    private final JPAUtil jpaUtil;
    private EntityManager em;
    private final UsuarioMapper mapper;

    @Inject
    public DaoUsuarioImpl(JPAUtil jpaUtil, UsuarioMapper mapper) {
        this.jpaUtil = jpaUtil;
        this.mapper = mapper;
    }

    public Usuario getUsuario(int id) {
        em = jpaUtil.getEntityManager();
        try {
            UsuarioEntity usuarioEntity = em.find(UsuarioEntity.class, id);
            return mapper.toUsuario(usuarioEntity);
        } catch (Exception e) {
            // Manejar la excepción
            return null;
        } finally {
            em.close();
        }
    }
}
