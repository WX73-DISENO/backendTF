package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.Entities.Users;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateUserCommand;

import java.util.Optional;

public interface UserCommandService {


    Optional<Users> handle(CreateUserCommand command);
}
