package backend.housekeeper.houseelegantservice.application.internal.commandservices;

import backend.housekeeper.houseelegantservice.domain.model.Entities.Users;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateUserCommand;
import backend.housekeeper.houseelegantservice.domain.service.UserCommandService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCommandServiceImpl implements UserCommandService {

    private final UserRepository userRepository;

    public UserCommandServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Long handle(CreateUserCommand command) {
        var User = new Users(command.email(), command.password(), command.firstName(), command.lastName(), command.birthdate(), command.number(), command.passwordRepeat(), command.typeUser());
        userRepository.save(User);
        return User.getId();
    }
}
