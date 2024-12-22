package dao.impl;

import dao.hibernate.JPAUtil;
import dao.modelo.UsuarioEntity;
import dao.modelo.mappers.UsuarioMapper;
import domain.model.Caso;
import domain.model.Cliente;
import domain.model.Usuario;
import domain.model.enums.EstadoCaso;
import domain.model.enums.EstadoReclamacion;
import domain.model.enums.Permiso;
import domain.model.enums.Plazo;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import lombok.extern.log4j.Log4j2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<Usuario> usuarios = new ArrayList<>();
        Usuario u = new Usuario(
                1,
                "Juan Pérez",
                Permiso.ADMINISTRADOR,
                List.of());
        usuarios.add(u);
Usuario u2 = new Usuario(
        2,
        "María García",
        Permiso.ABOGADO,
        List.of(new Caso(
                2, new Cliente("2")
        ), new Caso(
                3,
                new Cliente("3")
        )));

        usuarios.add(u2);
Usuario u3 = new Usuario(
        3,
        "Pedro López",
        Permiso.COMERCIAL,
        List.of(new Caso(
                1, new Cliente("3")
        ))
);
        usuarios.add(u3);

        return usuarios.stream().filter(uu -> uu.getId() == id).findFirst().orElse(null);
    }
   /* public Usuario getUsuario(int id) {
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
}*/
}
