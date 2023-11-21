package backend.housekeeper.houseelegantservice.domain.model.aggregates;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
@Entity
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "photoUrl")
    private String photoUrl;

    @Column(name = "rating")
    private float rating;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;

    public Viaje() {

    }
    public Viaje(String title, String description, String photoUrl, float rating) {
        this.title = title;
        this.description = description;
        this.photoUrl = photoUrl;
        this.rating = rating;
    }

    public void update(String title, String description, String photoUrl, float rating) {
        this.title = title;
        this.description = description;
        this.photoUrl = photoUrl;
        this.rating = rating;

        this.updatedAt = new Date();
    }
}
