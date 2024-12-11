package domain.model;

import lombok.Data;

import java.util.List;

@Data
public class Formulario {
    private String telefono;
    private String nombre_apellidos;
    private String email;
    private String observaciones;
    private List<Documento> documentos;
}
