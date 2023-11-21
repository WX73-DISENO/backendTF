package backend.housekeeper.houseelegantservice.domain.model.aggregates;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Getter
@Entity
public class KeeperRequest {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "message")
    private String message;

    @Column(name = "photoUrl")
    private String photoUrl;

    @Column(name = "rating")
    private Float rating;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;

    public KeeperRequest() {

    }

    public KeeperRequest(String name, String message, String photoUrl, Float rating){
        this.name =  name;
        this.message = message;
        this.photoUrl = photoUrl;
        this.rating = rating;
    }


}
