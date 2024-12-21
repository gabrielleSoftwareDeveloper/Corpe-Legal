package dao.hibernate;

import jakarta.inject.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import static common.Cons.UNIT_3_HIBERNATE;


@Singleton
public class JPAUtil {


    private EntityManagerFactory emf;

    public JPAUtil() {
        emf = getEmf();
    }

    private EntityManagerFactory getEmf() {
        return Persistence.createEntityManagerFactory(UNIT_3_HIBERNATE);
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }


}
