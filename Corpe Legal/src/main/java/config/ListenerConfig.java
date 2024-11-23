package config;

import dao.impl.DaoBD;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import static common.Cons.DAO_BD;

@WebListener()
public class ListenerConfig implements ServletContextListener {


    private final DaoBD pool;

    @Inject
    public ListenerConfig(@Named(DAO_BD) DaoBD pool) {
        this.pool = pool;
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        pool.closePool();
    }
}