package backend.housekeeper.houseelegantservice.domain.model.aggregates;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
@Getter
@Entity
public class MensajeriaTraveller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name = "description")
    private String description;

    @Column(name = "photo_face")
    private String photoFace;

}
