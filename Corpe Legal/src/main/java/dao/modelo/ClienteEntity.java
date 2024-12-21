package dao.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "clientes")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "DNI")
    private String DNI;
    @Column(name = "nombre_apellidos")
    private String nombre_apellidos;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "localidad")
    private String localidad;

    //revisar
    @Lob
    private byte[]  fotoDNI;

    public ClienteEntity(String telefono, String nombre_apellidos, String email) {
        this.telefono = telefono;
        this.nombre_apellidos = nombre_apellidos;
        this.email = email;
    }
}
