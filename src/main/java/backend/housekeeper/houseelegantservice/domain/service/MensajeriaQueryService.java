package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Mensajeria;
import org.springframework.stereotype.Service;
//import backend.housekeeper.houseelegantservice.domain.model.queries.GetMensajeriaByidQuery;

import java.util.List;
import java.util.Optional;

public interface MensajeriaQueryService {
    Mensajeria getMensajeriaById(Long mensajeriaId);
    List<Mensajeria> getAllMensajes();
}
