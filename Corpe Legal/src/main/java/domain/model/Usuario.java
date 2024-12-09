package domain.model;

import domain.model.enums.Permiso;
import lombok.Data;

@Data
public class Usuario {
    private int id;
    private Permiso rol;
    private String nombreApellidos;
    private String nombreApellidossuplente;
}
