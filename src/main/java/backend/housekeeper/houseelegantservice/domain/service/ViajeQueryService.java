package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;

import java.util.List;
import java.util.Optional;

public interface ViajeQueryService {
    Viaje getViajeById(Long viajeId);
    List<Viaje> getAllViajes();
    List<Viaje> handle(GetViajeAllQuery query);
}
