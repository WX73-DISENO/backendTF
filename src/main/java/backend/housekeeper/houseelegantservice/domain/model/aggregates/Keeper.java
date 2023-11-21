package backend.housekeeper.houseelegantservice.domain.model.aggregates;
import backend.housekeeper.houseelegantservice.domain.model.valueobjects.KeeperName;
import backend.housekeeper.houseelegantservice.domain.model.valueobjects.KeeperRecordId;
import backend.housekeeper.houseelegantservice.domain.model.valueobjects.StreetAddress;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
@Getter
@Entity
public class Keeper {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Embedded
    @Column(name = "keeper_record_id")
    private KeeperRecordId  keeperRecordId;


    @Embedded
    @Column(name = "name")
    private KeeperName name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "address_street")),
            @AttributeOverride(name = "city", column = @Column(name = "address_city")),
            @AttributeOverride(name = "country", column = @Column(name = "address_country"))
    })
    private StreetAddress address;

    @Column(name = "description")
    private String description;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "rating")
    private Float rating;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;


    public Keeper(String firstName, String lastName, String description, String street, String city, String country) {
        this.name = new KeeperName(firstName, lastName);
        this.description = description;
        this.address = new StreetAddress(street, city, country);
    }

    public Keeper(){

    }


    public String getFullName() {
        return this.name.getFullName();
    }

    public String getStreetAddress() {
        return this.address.getStreetAddress();
    }



}
