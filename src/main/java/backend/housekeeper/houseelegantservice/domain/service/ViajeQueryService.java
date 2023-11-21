package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;

import java.util.List;

public interface ViajeQueryService {
    Viaje getViajeById(Long viajeId);
    List<Viaje> getAllViajes();
}
