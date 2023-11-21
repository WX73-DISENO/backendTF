package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;
import backend.housekeeper.houseelegantservice.domain.model.queries.GetViajeAllQuery;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ViajeQueryService{
    //List<Viaje> handle(GetViajeAllQuery query);
    Viaje getViajeById(Long viajeId);
    List<Viaje> getAllViajes();
}