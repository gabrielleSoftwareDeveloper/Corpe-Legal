package dao.impl;

import dao.hibernate.JPAUtil;
import dao.modelo.CasoEntity;
import dao.modelo.UsuarioEntity;
import dao.modelo.mappers.CasoMapper;
import domain.model.Caso;
import domain.model.Cliente;
import domain.model.Usuario;
import domain.model.enums.EstadoCaso;
import domain.model.enums.EstadoReclamacion;
import domain.model.enums.Plazo;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DaoCasoImpl {
    private final JPAUtil jpaUtil;
    private EntityManager em;
    private final CasoMapper mapper;

    @Inject
    public DaoCasoImpl(JPAUtil jpaUtil, CasoMapper mapper) {
        this.jpaUtil = jpaUtil;
        this.mapper = mapper;
    }

    /* public Caso getCaso(int id) {
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
     }*/

    public Caso getCaso(int id) {
        List<Caso> casos = new ArrayList<>();
        casos.add(new Caso(
                3, new Cliente("3")
        ));
        casos.add(new Caso(
                2, new Cliente("2")
        ));
        casos.add(new Caso(
                1, new Cliente("1")
        ));

        Caso caso = casos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
        return caso;
    }
}
