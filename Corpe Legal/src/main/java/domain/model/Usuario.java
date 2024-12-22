package domain.model;

import domain.model.enums.Permiso;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@Setter
public class Usuario {
    //codigo de angel en el modelo de bbdd??
    private int id;
    private String nombre_apellidos;
    private Permiso rol;
    private List<Caso> casos;

    public Usuario(int id, String nombre_apellidos, Permiso rol, List<Caso> casos) {
        this.nombre_apellidos = nombre_apellidos;
        this.id = id;
        this.rol = rol;
        this.casos = casos;
    }

    public int getId() {
        return id;
    }
}
