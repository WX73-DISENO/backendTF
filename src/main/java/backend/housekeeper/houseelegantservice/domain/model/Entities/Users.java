package backend.housekeeper.houseelegantservice.domain.model.Entities;

import backend.housekeeper.houseelegantservice.domain.model.valueobjects.EmailAddress;
import backend.housekeeper.houseelegantservice.domain.model.valueobjects.Password;
import backend.housekeeper.houseelegantservice.domain.model.valueobjects.PasswordRepeat;
import backend.housekeeper.houseelegantservice.domain.model.valueobjects.PersonName;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Embedded
    private EmailAddress emailAddress;

    @Embedded
    private Password password;

    @Embedded
    private PersonName personName;


    private Date birthdate;


    private int number;

    @Embedded
    private PasswordRepeat passwordRepeat;

    private String typeUser;


    public Users(Long id, String email, String password, String firstName,String lastName, Date birthdate, int number, String passwordRepeat, String typeUser) {
        this.id = id;
        this.emailAddress = new EmailAddress(email);
        this.password = new Password(password);
        this.personName =new PersonName(firstName,lastName);
        this.birthdate = birthdate;
        this.number = number;
        this.passwordRepeat = new PasswordRepeat(password,passwordRepeat);
        this.typeUser = typeUser;
    }

    public Users(){}
}
