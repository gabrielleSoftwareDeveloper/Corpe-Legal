package domain.model;

import dao.modelo.ClienteEntity;
import domain.model.enums.EstadoReclamacion;
import domain.model.enums.EstadoCaso;
import domain.model.enums.Plazo;
import lombok.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
public class Caso {
    private int id;
    private int expediente;
    private Cliente cliente;
    private String servicios;
    private LocalDate inicio_prestamo;
    private LocalDate fin_prestamo;
    private EstadoCaso estado_caso;
    private String DNI_apoderamiento;
    private String forma;
    private String provision;
    private String partido_judicial;
    private LocalDate fecha_expediente;
    private LocalDate fecha_demanda;
    private LocalDate fecha_reclamacion;
    private LocalDate fecha_espera;
    private long dias_espera;
    private LocalDate fecha_contestacion;
    private LocalDate fecha_sentencia;
    private EstadoReclamacion estado_reclamacion;
    private int cuotas;
    private int mensualidad_cuotas;
    private int pendiente;
    private int pago;
    private LocalDate fecha_prevista_pago;
    private LocalDate fecha_real_pago;
    private List<Documento> documentos;
    private String observaciones;
    private boolean viavilidad;
    private Plazo plazo;
    private LocalDate fecha_juicio;
    private String entidad_financiera;
    private String asesor;
    private String abogado;
    private String procurador;

    // calcular fecha_espera y dias_espera
    public void setFechaReclamacion(LocalDate fecha_reclamacion) {
        this.fecha_reclamacion = fecha_reclamacion;
        if (fecha_reclamacion != null) {
            this.fecha_espera = fecha_reclamacion.plusDays(31);
            this.dias_espera = ChronoUnit.DAYS.between(fecha_reclamacion, this.fecha_espera);
        }
    }

    public Caso(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }
}
