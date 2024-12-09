package domain.model;

import domain.model.enums.EstadoCaso;
import domain.model.enums.EstadoRevision;
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

    private int id;
    private boolean viavilidad;
    //el que pasa de comerciales  abogados y vicebersa
    private EstadoRevision estadoRevision;
    private LocalDate fechaReclamacion;
    private LocalDate fechaExpediente;
    //cuidado el NullPointer
    private final LocalDate fechaEspera = fechaReclamacion.plusDays(31);
    private long diasEspera = ChronoUnit.DAYS.between(fechaReclamacion, fechaEspera);
    private Plazo plazo;
    //cuando llega al Paso 5 del PDF
    private EstadoCaso estadoCaso;
    private LocalDate fechaContestacion;
    private LocalDate fechaJuicio;
    private LocalDate fechaDemanda;
    private LocalDate fechaSentencia;
    private List<Documento> documentos;
    private String expediente;
    private LocalDate inicioPrestamo;
    private LocalDate finPrestamo;;
    private String entidadFinanciera;
    private String provision;
    private String servicios;
    private String forma;
    private String partidoJudicial;
    private String asesor;
    private String abogado;
    private String procurador;
    private String apoderamiento;
    private String observaciones;
}
