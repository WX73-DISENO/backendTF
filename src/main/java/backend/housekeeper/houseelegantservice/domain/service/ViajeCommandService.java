package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.command.CreateViajeCommand;

public interface ViajeCommandService {
    Long handle(CreateViajeCommand command);
    Viaje createViaje(CreateViajeCommand command);
    void updateViaje(Long viajeId, UpdateViajeCommand command);
    void deleteViaje(Long viajeId);
    Viaje handle(CreateViajeCommand  command);
}
