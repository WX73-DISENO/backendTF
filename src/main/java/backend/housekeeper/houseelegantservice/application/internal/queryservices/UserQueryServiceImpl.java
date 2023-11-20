package backend.housekeeper.houseelegantservice.application.internal.queryservices;

import backend.housekeeper.houseelegantservice.domain.model.Entities.Users;
import backend.housekeeper.houseelegantservice.domain.model.queries.GetMensajeriaAllQuery;
import backend.housekeeper.houseelegantservice.domain.service.UserQueryService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserQueryServiceImpl implements UserQueryService {
    private final UserRepository userRepository;

    public UserQueryServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Users> handle(GetMensajeriaAllQuery query) {
        return userRepository.findAll();
    }
}
