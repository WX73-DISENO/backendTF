package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.Entities.Users;
import backend.housekeeper.houseelegantservice.domain.model.queries.GetMensajeriaAllQuery;

import java.util.Optional;

public interface UserQueryService {

    Optional<Users> handle(GetMensajeriaAllQuery query);
}
