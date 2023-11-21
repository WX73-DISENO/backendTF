package backend.housekeeper.houseelegantservice.interfaces.acl;

import backend.housekeeper.houseelegantservice.domain.model.command.CreateUserCommand;
import backend.housekeeper.houseelegantservice.domain.service.UserCommandService;
import backend.housekeeper.houseelegantservice.domain.service.UserQueryService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserContextFacade {
    private final UserCommandService userCommandService;

    private final UserQueryService userQueryService;

    public UserContextFacade(UserCommandService userCommandService, UserQueryService userQueryService) {
        this.userCommandService = userCommandService;
        this.userQueryService = userQueryService;
    }

    public Long createUser(String email, String password, String firstName, String lastName, Date birthdate, int number, String passwordRepeat, String typeUser){
        var createUserCommand = new CreateUserCommand(email, password, firstName, lastName, birthdate, number, passwordRepeat, typeUser);
        return userCommandService.handle(createUserCommand);
    }
}
