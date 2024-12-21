package domain.model;

import jakarta.persistence.Lob;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente {
    //pk
    private String email;
    private String telefono;
    private String DNI;
    private String nombre_apellidos;
    private String direccion;
    private String localidad;


    @Lob
    private byte[]  fotoDNI;
}
