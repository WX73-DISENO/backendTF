package backend.housekeeper.houseelegantservice.domain.model.aggregates;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
@Entity
public class MensajeriaTraveller {
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
}
