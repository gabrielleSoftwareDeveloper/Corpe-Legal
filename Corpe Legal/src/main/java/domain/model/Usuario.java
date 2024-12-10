package domain.model;

import domain.model.enums.Permiso;
import lombok.Data;

@Data
public class Usuario {
    //codigo de angel en el modelo de bbdd??
    private int id;

    private String nombre_apellidos;
    private Permiso rol;
}
