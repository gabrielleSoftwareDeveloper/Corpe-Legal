package common;

public class Cons {


    public static final String ADMIN = "admin";
    public static final String ID = "id";
    public static final String ERROR_DE_INTEGRIDAD = "Error de integridad";
    public static final String ERROR_DESCONOCIDO = "Error desconocido";
    public static final String ERROR_EN_LA_BASE_DE_DATOS = "Error en la base de datos";
    public static final String NO_EXISTE = "No existe";
    public static final String API_RUTA = "/api";
    public static final String EQUIPOS_RUTA = "/equipos";
    public static final String ID_RUTA = "/{id}";
    public static final String ESTADIOS_RUTA = "/estadios";
    public static final String JUGADORES_RUTA = "/jugadores";
    public static final String SELECT_J_FROM_JUGADOR_ENTITY_J = "select j from JugadorEntity j";
    public static final String SELECT_E_FROM_ESTADIO_ENTITY_E_ = "SELECT e FROM EstadioEntity e ";
    public static final String SELECT_E_FROM_EQUIPO_ENTITY_E = "SELECT e FROM EquipoEntity e";
    public static final String EQUIPO = "equipo";
    public static final String DELETE_FROM_JUGADOR_ENTITY_J_WHERE_J_EQUIPO_ENTITY_ID_EQUIPO = "DELETE FROM JugadorEntity j WHERE j.equipoEntity.id = :equipo";
    public static final String REGEX = " ";
    public static final String BASIC = "Basic";
    public static final String BEARER = "Bearer";
    public static final String ROLES = "roles";
    public static final String YO = "Yo";
    public static final String SERVER = "Server";
    public static final String USER = "user";
    public static final String ERROR_AL_GENERAR_EL_TOKEN = "Error al generar el token";
    public static final String EL_CODIGO_DE_ACTIVACION_HA_EXPIRADO = "El codigo de activacion ha expirado";
    public static final String SERVLET_ACTIVATION = "ServletActivation";
    public static final String ACTIVATE = "/activate";
    public static final String ACTIVATION = "activation";
    public static final String CODIGO = "codigo";
    public static final String LOGIN = "LOGIN";
    public static final String USUARIO_ACTIVADO_VUELVA_A_LA_APLICACION_PARA_INICIAR_SESION = "Usuario activado, vuelva a la aplicacion para iniciar sesion";
    public static final String MENSAJE = "mensaje";
    public static final String ERROR = "error";
    public static final String CREDENTIALS = "/credentials";
    public static final String LOGIN_RUTA = "/login";
    public static final String REGISTER_RUTA = "/register";
    public static final String HTML_GENERADO_A_HREF_HTTP_LOCALHOST_8080_REST_1_0_SNAPSHOT_ACTIVATE_CODIGO = "<html>generado <a href=\"http://localhost:8080/rest-1.0-SNAPSHOT/activate?codigo=";
    public static final String PULSAME_A = "\" >Pulsame </a>";
    public static final String P_VALIDO_HASTA_P = "<p>Valido hasta </p>";
    public static final String HTML = " </html > ";
    public static final String CODIGO_DE_ACTIVACION = "codigo de activacion";
    public static final String REGEX1 = ":";
    public static final String TOKEN_EXPIRADO = "Token expirado";
    public static final String JWT = "JWT";
    public static final String SELECT_L_FROM_LOGIN_ENTITY_L_WHERE_L_USER_USER = "select l from LoginEntity l where l.user = :user";
    public static final String EL_USUARIO_NO_ESTA_ACTIVADO = "El usuario no está activado";
    public static final String SELECT_L_HORA_FROM_LOGIN_ENTITY_L_WHERE_L_CODIGO_CODIGO = "select l.hora from LoginEntity l where l.codigo = :codigo";
    public static final String UPDATE_LOGIN_ENTITY_L_SET_L_ACTIVATED_TRUE_WHERE_L_CODIGO_CODIGO = "update LoginEntity l set l.activated = true where l.codigo = :codigo";
    public static final String UNIT_3_HIBERNATE = "unit3.";
}
