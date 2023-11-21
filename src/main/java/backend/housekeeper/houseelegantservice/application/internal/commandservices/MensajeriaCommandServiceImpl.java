package backend.housekeeper.houseelegantservice.application.internal.commandservices;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Mensajeria;
import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateMensajeriaCommand;
import backend.housekeeper.houseelegantservice.domain.service.MensajeriaCommandService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.MensajeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajeriaCommandServiceImpl implements MensajeriaCommandService {
    private final MensajeriaRepository mensajeriaRepository;

    @Autowired
    public MensajeriaCommandServiceImpl(MensajeriaRepository mensajeriaRepository) {
        this.mensajeriaRepository = mensajeriaRepository;
    }

    @Override
    public Mensajeria createMensajeria(CreateMensajeriaCommand command) {
        Mensajeria mensajeria = new Mensajeria(command.nombre(), command.description(), command.photoFace());
        Mensajeria savedMensajeria = mensajeriaRepository.save(mensajeria);
        return savedMensajeria;
    }

    @Override
    public void deleteMensajeria(Long mensajeriaId) {
        Mensajeria existingMensaje = mensajeriaRepository.findById(mensajeriaId)
                .orElseThrow(() -> new MensajeriaNotFoundException("Mensaje not found"));

        mensajeriaRepository.delete(existingMensaje);
    }

}