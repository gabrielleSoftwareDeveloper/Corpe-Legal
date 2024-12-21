package domain.model;

import domain.model.enums.Permiso;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    //codigo de angel en el modelo de bbdd??
    private int id;
    private String nombre_apellidos;
    private Permiso rol;
    private List<Caso> casos;
}
