package dao.impl;

import dao.hibernate.JPAUtil;
import dao.modelo.CasoEntity;
import dao.modelo.UsuarioEntity;
import dao.modelo.mappers.CasoMapper;
import domain.model.Caso;
import domain.model.Usuario;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

public class DaoCasoImpl {
    private final JPAUtil jpaUtil;
    private EntityManager em;
    private final CasoMapper mapper;

    @Inject
    public DaoCasoImpl(JPAUtil jpaUtil, CasoMapper mapper) {
        this.jpaUtil = jpaUtil;
        this.mapper = mapper;
    }

    public Caso getCaso(int id) {
        em = jpaUtil.getEntityManager();
        try {
            CasoEntity casoEntity = em.find(CasoEntity.class, id);
            return mapper.toCaso(casoEntity);
        } catch (Exception e) {
            // Manejar la excepción
            return null;
        } finally {
            em.close();
        }
    }
}
