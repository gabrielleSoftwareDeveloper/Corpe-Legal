package dao.modelo.mappers;

import dao.modelo.CasoEntity;
import domain.model.Caso;
import domain.model.enums.EstadoCaso;
import domain.model.enums.EstadoReclamacion;
import domain.model.enums.Plazo;
import jakarta.inject.Inject;


// Java
public class CasoMapper {
 /*   private final ClienteMapper clienteMapper;

    @Inject
    public CasoMapper(ClienteMapper clienteMapper) {
        this.clienteMapper = clienteMapper;
    }

    public CasoEntity toCasoEntity(Caso caso) {
        return new CasoEntity(
                caso.getId(),
                caso.getExpediente(),
                clienteMapper.toClienteEntity(caso.getCliente()),
                caso.getServicios(),
                caso.getInicio_prestamo(),
                caso.getFin_prestamo(),
                caso.getEstado_caso().toString(),
                caso.getDNI_apoderamiento(),
                caso.getForma(),
                caso.getProvision(),
                caso.getPartido_judicial(),
                caso.getFecha_expediente(),
                caso.getFecha_demanda(),
                caso.getFecha_reclamacion(),
                caso.getFecha_espera(),
                (int) caso.getDias_espera(),
                caso.getFecha_contestacion(),
                caso.getFecha_sentencia(),
                caso.getEstado_reclamacion().toString(),
                caso.getCuotas(),
                caso.getMensualidad_cuotas(),
                caso.getPendiente(),
                caso.getPago(),
                caso.getFecha_prevista_pago(),
                caso.getFecha_real_pago(),
                caso.getDocumentos(),
                caso.getObservaciones(),
                caso.isViavilidad(),
                caso.getPlazo().toString(),
                caso.getFecha_juicio(),
                caso.getEntidad_financiera(),
                caso.getAsesor(),
                caso.getAbogado(),
                caso.getProcurador()
        );
    }

    public Caso toCaso(CasoEntity casoEntity) {
        Caso caso = new Caso(
                casoEntity.getId(),
                casoEntity.getExpediente(),
                clienteMapper.toCliente(casoEntity.getCliente()),
                casoEntity.getServicios(),
                casoEntity.getInicio_prestamo(),
                casoEntity.getFin_prestamo(),
                EstadoCaso.valueOf(casoEntity.getEstado_caso()),
                casoEntity.getDNI_apoderamiento(),
                casoEntity.getForma(),
                casoEntity.getProvision(),
                casoEntity.getPartido_judicial(),
                casoEntity.getFecha_expediente(),
                casoEntity.getFecha_demanda(),
                casoEntity.getFecha_reclamacion(),
                casoEntity.getFecha_espera(),
                casoEntity.getDias_espera(),
                casoEntity.getFecha_contestacion(),
                casoEntity.getFecha_sentencia(),
                EstadoReclamacion.valueOf(casoEntity.getEstado_reclamacion()),
                casoEntity.getCuotas(),
                casoEntity.getMensualidad_cuotas(),
                casoEntity.getPendiente(),
                casoEntity.getPago(),
                casoEntity.getFecha_prevista_pago(),
                casoEntity.getFecha_real_pago(),
                casoEntity.getDocumentos(),
                casoEntity.getObservaciones(),
                casoEntity.isViavilidad(),
                Plazo.valueOf(casoEntity.getPlazo()),
                casoEntity.getFecha_juicio(),
                casoEntity.getEntidad_financiera(),
                casoEntity.getAsesor(),
                casoEntity.getAbogado(),
                casoEntity.getProcurador()
        );
        if (casoEntity.getFecha_reclamacion() != null) {
            caso.setFechaReclamacion(casoEntity.getFecha_reclamacion());
        }
        return caso;
    }*/
}


