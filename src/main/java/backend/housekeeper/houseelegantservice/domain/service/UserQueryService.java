package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.Entities.Users;
import backend.housekeeper.houseelegantservice.domain.model.queries.GetMensajeriaAllQuery;

import java.util.List;
import java.util.Optional;

public interface UserQueryService {

    List<Users> handle(GetMensajeriaAllQuery query);
}
