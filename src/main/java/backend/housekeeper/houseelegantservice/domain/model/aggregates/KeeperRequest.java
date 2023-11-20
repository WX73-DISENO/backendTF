package backend.housekeeper.houseelegantservice.domain.model.aggregates;
import backend.housekeeper.houseelegantservice.domain.model.valueobjects.KeeperName;
import backend.housekeeper.shared.domain.model.entities.AuditableModel;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;



public class KeeperRequest extends AuditableModel {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private KeeperName name;
    @Getter
    private String message;
    @Getter
    private String photoUrl;
    @Getter
    private double rating;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;




    public KeeperRequest(String firstName,String lastName, String message, String photoUrl){
        this.name =  new KeeperName(firstName,lastName);
        this.message = message;
        this.photoUrl = photoUrl;
    }

}
