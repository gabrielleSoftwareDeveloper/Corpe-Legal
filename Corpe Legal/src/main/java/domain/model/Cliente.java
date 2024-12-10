package domain.model;

import jakarta.persistence.Lob;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Cliente {
    private String DNI;
    private String nombre_apellidos;
    private String direccion;
    private String email;
    private int telefono;
    @Lob
    private byte[]  fotoDNI;





}
