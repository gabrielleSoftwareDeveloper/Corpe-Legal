package domain.model;

import jakarta.persistence.Lob;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Cliente {
    //pk
    private String telefono;
    private String DNI;
    private String nombre_apellidos;
    private String direccion;
    private String localidad;
    private String email;

    @Lob
    private byte[]  fotoDNI;





}
