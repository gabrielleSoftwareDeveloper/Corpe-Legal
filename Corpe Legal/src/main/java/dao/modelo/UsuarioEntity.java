package dao.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {
    @Id
    //revisar
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "nombre_apellidos")
    private String nombre_apellidos;
    @Column(name = "rol")
    private String rol;
    @ManyToMany
    @JoinTable(
            name = "usuarios_casos", // Nombre de la tabla de unión
            joinColumns = @JoinColumn(name = "usuario_id"), // Columna de esta entidad
            inverseJoinColumns = @JoinColumn(name = "caso_id") // Columna de la otra entidad
    )
    private Collection<CasoEntity> casos;
}
