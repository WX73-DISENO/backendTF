package backend.housekeeper.houseelegantservice.application.internal.commandservices;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateViajeCommand;
import backend.housekeeper.houseelegantservice.domain.model.command.UpdateViajeCommand;
import backend.housekeeper.houseelegantservice.domain.service.ViajeCommandService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViajeCommandServiceImpl implements ViajeCommandService {
    private final ViajeRepository viajeRepository;

    @Autowired
    public ViajeCommandServiceImpl(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @Override
    public Viaje createViaje(CreateViajeCommand command) {
        Viaje viaje = new Viaje(command.title(), command.description(), command.photoUrl(), command.rating());
        return viajeRepository.save(viaje);
    }

    @Override
    public void updateViaje(Long viajeId, UpdateViajeCommand command) {

        Viaje existingViaje = viajeRepository.findById(viajeId)
                .orElseThrow(() -> new ViajeNotFoundException("Viaje not found"));

        existingViaje.update(command.title(), command.description(), command.photoUrl(), command.rating());

        viajeRepository.save(existingViaje);
    }

    @Override
    public void deleteViaje(Long viajeId) {
        Viaje existingViaje = viajeRepository.findById(viajeId)
                .orElseThrow(() -> new ViajeNotFoundException("Viaje not found"));

        viajeRepository.delete(existingViaje);
    }
}