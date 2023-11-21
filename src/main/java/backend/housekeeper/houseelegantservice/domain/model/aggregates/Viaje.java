package backend.housekeeper.houseelegantservice.domain.model.aggregates;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Getter
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name = "description") // Puedes personalizar el nombre de la columna si es necesario
    private String description;

    @Column(name = "photo_face") // Puedes personalizar el nombre de la columna si es necesario
    private String photoFace;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;

    public Viaje(String nombre, String description, String photoFace) {
        this.nombre = nombre;
        this.description = description;
        this.photoFace = photoFace;
    }

    public Viaje(){}
}
