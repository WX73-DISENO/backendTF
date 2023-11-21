package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Mensajeria;
import backend.housekeeper.houseelegantservice.domain.model.queries.GetMensajeriaByidQuery;

import java.util.Optional;

public interface MensajeriaQueryService {
    Optional<Mensajeria> handle(GetMensajeriaByidQuery query);
}
