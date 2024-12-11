package config;


import jakarta.inject.Singleton;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.util.Properties;

import static common.Cons.*;

@Log4j2
@Getter
@Singleton
public class Config {


    private String urlDB;
    private String user;
    private String password;
    private String driver;
    private int time;
    private int llamadas;

    public Config() {
        try {
            Properties p = new Properties();
            p.load(getClass().getClassLoader().getResourceAsStream(RUTA_YAML));
            urlDB = (String) p.get(URL_DB);
            user = (String) p.get(USER);
            password = (String) p.get(PASSWORD);
            driver = (String) p.get(DRIVER);
        } catch (Exception e) {
            log.error(ERROR_IN_CONFIG + e.getMessage());
        }

    }
}
