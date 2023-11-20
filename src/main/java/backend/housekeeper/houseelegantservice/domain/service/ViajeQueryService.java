package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;
import backend.housekeeper.houseelegantservice.domain.model.queries.GetViajeAllQuery;

import java.util.Optional;

public interface ViajeQueryService {

    Optional<Viaje>handle(GetViajeAllQuery query);
}
