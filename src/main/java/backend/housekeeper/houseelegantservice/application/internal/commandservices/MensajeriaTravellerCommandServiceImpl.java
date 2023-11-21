package backend.housekeeper.houseelegantservice.application.internal.commandservices;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Mensajeria;
import backend.housekeeper.houseelegantservice.domain.model.aggregates.MensajeriaTraveller;
import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateMensajeriaCommand;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateMensajeriaTravellerCommand;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateViajeCommand;
import backend.housekeeper.houseelegantservice.domain.service.MensajeriaCommandService;
import backend.housekeeper.houseelegantservice.domain.service.MensajeriaTravellerCommandService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.MensajeriaRepository;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.MensajeriaTravellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajeriaTravellerCommandServiceImpl implements MensajeriaTravellerCommandService{
    private final MensajeriaTravellerRepository mensajeriaTravellerRepository;

    @Autowired
    public MensajeriaTravellerCommandServiceImpl(MensajeriaTravellerRepository mensajeriaTravellRepository) {
        this.mensajeriaTravellerRepository = mensajeriaTravellRepository;
    }

    @Override
    public MensajeriaTraveller createMensajeriaTraveller(CreateMensajeriaTravellerCommand command) {
        MensajeriaTraveller mensajeriaTraveller = new MensajeriaTraveller(command.nombre(), command.description(), command.photoFace());
        MensajeriaTraveller savedMensajeriaTraveller = mensajeriaTravellerRepository.save(mensajeriaTraveller);
        return savedMensajeriaTraveller;
    }

    @Override
    public void deleteMensajeria(Long mensajeriaId) {
        MensajeriaTraveller existingMensaje = mensajeriaTravellerRepository.findById(mensajeriaId)
                .orElseThrow(() -> new MensajeriaTravellerNotFoundException("Mensaje not found"));

        mensajeriaTravellerRepository.delete(existingMensaje);
    }
}