package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateViajeCommand;
import org.springframework.stereotype.Service;

public interface ViajeCommandService {
    Viaje createViaje(CreateViajeCommand command);
    void deleteViaje(Long viajeId);
}
