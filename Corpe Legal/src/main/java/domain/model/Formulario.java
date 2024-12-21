package domain.model;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Formulario {
    private String telefono;
    private String nombre_apellidos;
    private String email;
    private String observaciones;
    private List<Documento> documentos;
}
