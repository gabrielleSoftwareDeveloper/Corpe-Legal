package domain.model;

import jakarta.persistence.Lob;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Cliente {
    private String dni;
    private String nombreApellidos;
    private String correo;
    private String direccion;
    private int telefono;
    @Lob
    private byte[]  fotoDNI;





}
