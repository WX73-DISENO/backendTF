package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.Entities.Users;
import backend.housekeeper.houseelegantservice.domain.model.query.GetMensajeriaAllQuery;

import java.util.List;

public interface UserQueryService {

    List<Users> handle(GetMensajeriaAllQuery query);
}
