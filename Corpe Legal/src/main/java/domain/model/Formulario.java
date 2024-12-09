package domain.model;

import lombok.Data;

import java.util.List;

@Data
public class Formulario {
    private String nombre;
    private String correo;
    private String notas;
    private List<Documento> documentos;
}
