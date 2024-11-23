package common;

public class Cons {
    public static final String RUTA_YAML = "config/config.yaml";
    public static final String URL_DB = "urlDB";
    public static final String USER = "user";
    public static final String PASSWORD = "password";
    public static final String DRIVER = "driver";
    public static final String ERROR_IN_CONFIG = "Error in Config class: ";
    public static final String DAO_BD = "daoBD";
    public static final String ERROR_DE_INTEGRIDAD = "Error de integridad";
    public static final String ERROR_DESCONOCIDO = "Error desconocido";
    public static final String RELEASE_DATE = "release_date";
    public static final String NAME_NEWSPAPER = "name_newspaper";
    public static final String ID = "id";
    public static final String NAME_READER = "name_reader";
    public static final String BIRTH_READER = "birth_reader";
    public static final String DATABASE_NOT_AVAILABLE = "Database not available";
    public static final String READER_NOT_FOUND = "Reader not found";
    public static final String THE_NEWSPAPER_COULD_NOT_BE_DELETED = "the newspaper could not be deleted";
    public static final String NO_EXISTE_EL_LECTOR = "No existe el lector";
    public static final String NEWSPAPERS_RUTA = "/newspapers";
    public static final String ID_RUTA = "/{id}";
    public static final String API_RUTA = "/api";
    public static final String TYPE_ID_RUTA = "/type/{idType}";
    public static final String OLDEST_ID_NEWSPAPER = "/oldest/{idNewspaper}";
    public static final String NEWSPAPER_ID_NEWSPAPER = "/newspaper/{idNewspaper}";
    public static final String ID_NEWSPAPER = "idNewspaper";
    public static final String ID_TYPE = "idType";
    public static final String READERS_RUTA = "/readers";

    public static final String USUARIO_O_CONTRASEÑA_INCORRECTOS = "Usuario o contraseña incorrectos";

    public static final String ACTIVATION = "activation";
    public static final String CODIGO = "codigo";
    public static final String LOGIN = "LOGIN";
    public static final String USUARIO_ACTIVADO_VUELVA_A_LA_APLICACION_PARA_INICIAR_SESION = "Usuario activado, vuelva a la aplicacion para iniciar sesion";
    public static final String MENSAJE = "mensaje";
    public static final String ERROR = "error";

    public static final String PASSWORD_1 = "password1";
    public static final String PASSWORD_2 = "password2";
    public static final String CONTRASEÑA_CAMBIADA_VUELVA_A_LA_APLICACION_PARA_INICIAR_SESION = "Contraseña cambiada, vuelva a la aplicacion para iniciar sesion";
    public static final String LAS_CONTRASEÑAS_NO_COINCIDEN = "Las contraseñas no coinciden";

    public static final String SERVLET_ACTIVATION = "ServletActivation";
    public static final String ACTIVATE = "/activate";

    public static final String SERVLET_CONTRASEÑA = "ServletContraseña";
    public static final String PASSWORD_SERVLET = "/password";


    public static final String CREDENTIALS = "/credentials";
    public static final String LOGIN_RUTA = "/login";
    public static final String REGISTER_RUTA = "/register";
    public static final String CHANGE_PASSWORD_RUTA = "/changePassword";
    public static final String HTML_GENERADO_A_HREF_HTTP_LOCALHOST_8080_REST_1_0_SNAPSHOT_ACTIVATE_CODIGO = "<html>generado <a href=\"http://localhost:8080/rest-1.0-SNAPSHOT/activate?codigo=";
    public static final String PULSAME_A = "\" >Pulsame </a>";
    public static final String P_VALIDO_HASTA_P = "<p>Valido hasta </p>";
    public static final String HTML = " </html > ";
    public static final String CODIGO_DE_ACTIVACION = "codigo de activacion";
    public static final String HTML_GENERADO_A_HREF_HTTP_LOCALHOST_8080_REST_1_0_SNAPSHOT_PASSWORD_USER = "<html>generado <a href=\"http://localhost:8080/rest-1.0-SNAPSHOT/password?user=";
    public static final String PULSAME_A_HTML = "\" >Pulsame </a> </html > ";
    public static final String CAMBIAR_CONTRASEÑA = "cambiar contraseña";


    public static final String SELECT_PASSWORD_ACTIVATED_FROM_LOGIN_OSCAR_WHERE_USER = "SELECT password, activated FROM login_oscar WHERE user = ? ";
    public static final String EL_USUARIO_NO_ESTA_ACTIVADO = "El usuario no esta activado";
    public static final String ERROR_EN_LA_BASE_DE_DATOS = "Error en la base de datos";
    public static final String INSERT_INTO_READER_NAME_READER_BIRTH_READER_VALUES = "INSERT INTO reader (name_reader, birth_reader) VALUES (?, ?)";
    public static final String INSERT_INTO_LOGIN_OSCAR_USER_PASSWORD_ID_READER_MAIL_CODIGO_ACTIVACION_HORA_ACTIVACION_VALUES = "INSERT INTO login_oscar (user, password, id_reader, mail, codigo_activacion, hora_activacion, rol) VALUES (?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_LOGIN_OSCAR_SET_ACTIVATED_1_WHERE_CODIGO_ACTIVACION = "UPDATE login_oscar SET activated = 1 WHERE codigo_activacion  = ?";
    public static final String SELECT_HORA_ACTIVACION_FROM_LOGIN_OSCAR_WHERE_CODIGO_ACTIVACION = "select hora_activacion from login_oscar where codigo_activacion = ?";
    public static final String EL_CODIGO_DE_ACTIVACION_HA_EXPIRADO = "El codigo de activacion ha expirado";
    public static final String UPDATE_LOGIN_OSCAR_SET_PASSWORD_WHERE_USER = "UPDATE login_oscar SET password = ? WHERE user = ?";
    public static final String EL_MAIL_NO_EXISTE = "El mail no existe";
    public static final String UPDATE_LOGIN_OSCAR_SET_HORA_ACTIVACION_WHERE_CODIGO_ACTIVACION = "UPDATE login_oscar SET hora_activacion = ? WHERE codigo_activacion  = ?";
    public static final String SELECT_MAIL_FROM_LOGIN_OSCAR_WHERE_CODIGO_ACTIVACION = "select mail from login_oscar where codigo_activacion = ?";
    public static final String INSERT_INTO_LLAMADAS_USER_FECHA_VALUES = "INSERT INTO llamadas (user, fecha) VALUES (?, ?)";
    public static final String SELECT_COUNT_ID_FROM_LLAMADAS_WHERE_USER_AND_FECHA_DATE_SUB_NOW_INTERVAL_10_MINUTE = "SELECT COUNT(id) FROM llamadas WHERE user = ? and fecha > DATE_SUB(NOW(), INTERVAL 10 MINUTE)";
    public static final String SELECT_FROM_LOGIN_OSCAR_WHERE_USER = "SELECT * FROM login_oscar WHERE user = ? ";
    public static final String LLEGASTE_AL_NUMERO_MAXIMO_DE_LLAMADAS = "llegaste al numero maximo de llamadas";
    public static final String REGEX = " ";
    public static final String BASIC = "Basic";
    public static final String BEARER = "Bearer";
    public static final String ROLES = "roles";
    public static final String YO = "Yo";
    public static final String SERVER = "Server";
}
