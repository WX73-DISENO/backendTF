package backend.housekeeper.houseelegantservice.domain.model.command;

import java.util.Date;

public record CreateUserCommand (String email, String password, String firstName, String lastName, Date birthdate, int number, String passwordRepeat, String typeUser){
}
