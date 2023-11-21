package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateViajeCommand;
import backend.housekeeper.houseelegantservice.domain.model.command.UpdateViajeCommand;

public interface ViajeCommandService {
    Viaje createViaje(CreateViajeCommand command);
    void updateViaje(Long viajeId, UpdateViajeCommand command);
    void deleteViaje(Long viajeId);

}
