package dao.modelo;

import domain.model.Documento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "casos")
public class CasoEntity {
    @Id
    //revisar
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "expediente")
    private int expediente;
    @ManyToOne
    @JoinColumn(name = "telefono_cliente", referencedColumnName = "telefono", nullable = false)
    private ClienteEntity cliente;
    @Column(name = "servicios")
    private String servicios;
    @Column(name = "inicio_prestamo")
    private LocalDate inicio_prestamo;
    @Column(name = "fin_prestamo")
    private LocalDate fin_prestamo;
    //el que pasa de comerciales  abogados y vicebersa
    @Column(name = "estado_caso")
    private String estado_caso;
    @Column(name = "DNI_apoderamiento")
    private String DNI_apoderamiento;
    @Column(name = "forma")
    private String forma;
    //revisar
    @Column(name = "provision")
    private String provision;

    @Column(name = "partido_judicial")
    private String partido_judicial;
    @Column(name = "fecha_expediente")
    private LocalDate fecha_expediente;
    @Column(name = "fecha_demanda")
    private LocalDate fecha_demanda;
    @Column(name = "fecha_reclamacion")
    private LocalDate fecha_reclamacion;
    //cuidado el NullPointer
    @Column(name = "fecha_espera")
    private LocalDate fecha_espera;
    @Column(name = "dias_espera")
    private int dias_espera;
    @Column(name = "fecha_contestacion")
    private LocalDate fecha_contestacion;
    @Column(name = "fecha_sentencia")
    private LocalDate fecha_sentencia;
    @Column(name = "estado_reclamacion")
    private String estado_reclamacion;
    @Column(name = "cuotas")
    private int cuotas ;
    @Column(name = "mensualidad_cuotas")
    private int mensualidad_cuotas;
    @Column(name = "pendiente")
    private int pendiente;

    //revisar
   // private int provision;

    @Column(name = "pago")
    private int pago;
    @Column(name = "fecha_prevista_pago")
    private LocalDate fecha_prevista_pago;
    @Column(name = "fecha_real_pago")
    private LocalDate fecha_real_pago;

    private List<Documento> documentos;

    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "viavilidad")
    private boolean viavilidad;
    @Column(name = "plazo")
    private String plazo;
    @Column(name = "fecha_juicio")
    private LocalDate fecha_juicio;
    @Column(name = "entidad_financiera")
    private String entidad_financiera;
    @Column(name = "asesor")
    private String asesor;
    @Column(name = "abogado")
    private String abogado;
    @Column(name = "procurador")
    private String procurador;

    public CasoEntity(String observaciones, List<Documento> documentos) {
        this.observaciones = observaciones;
        this.documentos = documentos;
    }
}
