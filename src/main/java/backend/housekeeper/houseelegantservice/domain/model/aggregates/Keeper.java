package backend.housekeeper.houseelegantservice.domain.model.aggregates;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Keeper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Keeper(String password, String name, String country, String city, String streetAddress, String description, String email, String photoUrl, String rating) {
        this.password = password;
        this.name = name;
        this.country = country;
        this.city = city;
        this.streetAddress = streetAddress;
        this.description = description;
        this.email = email;
        this.photoUrl = photoUrl;
        this.rating = rating;
    }
    private String password;
    private String name;
    private String country;
    private String city;
    private String streetAddress;
    private String description;
    private String email;
    private String photoUrl;
    private String rating;

    public Keeper() {
    }
}
