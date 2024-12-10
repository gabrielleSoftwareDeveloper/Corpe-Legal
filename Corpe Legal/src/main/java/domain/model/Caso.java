package domain.model;

import domain.model.enums.EstadoReclamacion;
import domain.model.enums.EstadoCaso;
import domain.model.enums.Plazo;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Data
@Getter
public class Caso {

    //faltan los campos del PASO 6 del PDF


    private String expediente;
    //DNi de Cliete u objeto?
    private String cliente;
    private String servicios;
    private LocalDate inicio_prestamo;
    private LocalDate fin_prestamo;
    //el que pasa de comerciales  abogados y vicebersa
    private EstadoCaso estado_caso;
    private String apoderamiento;
    //DNI apoderado??

    private String forma;
    private String provision;
    private String partido_judicial;
    private LocalDate fecha_expediente;
    private LocalDate fecha_demanda;
    private LocalDate fecha_reclamacion;
    //cuidado el NullPointer
    private final LocalDate fecha_espera = fecha_reclamacion.plusDays(31);
    private long dias_espera = ChronoUnit.DAYS.between(fecha_reclamacion, fecha_espera);
    private LocalDate fecha_contestacion;
    private LocalDate fecha_sentencia;
    private EstadoReclamacion estado_reclamacion;
    //cuotas int
    //mensualidad cuotas int
    //pendiente int
    //pago int
    //fecha_prevista_pago date
    //fecha_real_pago date
    private List<Documento> documentos;
    private String observaciones;

    //lo creo necesario
    private boolean viavilidad;


    //faltan por definir??
    private Plazo plazo;
    private LocalDate fechaJuicio;
    private String entidadFinanciera;
    private String asesor;
    private String abogado;
    private String procurador;

}
