package backend.housekeeper.houseelegantservice.domain.model.aggregates;

import backend.housekeeper.houseelegantservice.domain.model.valueobjects.HouseStatus;
import backend.housekeeper.houseelegantservice.domain.model.valueobjects.StreetAddress;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Getter
@Setter
public class House {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "address_street")),
            @AttributeOverride(name = "city", column = @Column(name = "address_city")),
            @AttributeOverride(name = "country", column = @Column(name = "address_country"))
    })
    private StreetAddress address;

    @Column(name = "price")
    private double price;

    @Column(name = "rating")
    private double rating;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "status")
    private HouseStatus status;

    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;

    public House(String street, String city, String country) {
        this.status = HouseStatus.FREE;
        this.address = new StreetAddress(street, city, country);

    }

    public House(Long id, String street, String city, String country, double price, double rating, String photoUrl, int capacity, HouseStatus status, Date createdAt, Date updatedAt) {
        this.id = id;
        this.address = new StreetAddress(street, city, country);
        this.price = price;
        this.rating = rating;
        this.photoUrl = photoUrl;
        this.capacity = capacity;
        this.status = HouseStatus.FREE;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getStreetAddress() {
        return this.address.getStreetAddress();
    }
}
