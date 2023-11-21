package backend.housekeeper.houseelegantservice.application.internal.queryservices;

import backend.housekeeper.houseelegantservice.application.internal.commandservices.MensajeriaNotFoundException;
import backend.housekeeper.houseelegantservice.domain.model.aggregates.Mensajeria;
import backend.housekeeper.houseelegantservice.domain.service.MensajeriaQueryService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.MensajeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MensajeriaQueryServiceImpl implements MensajeriaQueryService {

    private final MensajeriaRepository mensajeriaRepository;

    @Autowired
    public MensajeriaQueryServiceImpl(MensajeriaRepository mensajeriaRepository) {
        this.mensajeriaRepository = mensajeriaRepository;
    }

    @Override
    public Mensajeria getMensajeriaById(Long mensajeriaId) {
        return mensajeriaRepository.findById(mensajeriaId)
                .orElseThrow(() -> new MensajeriaNotFoundException("Mensajeria not found"));
    }

    @Override
    public List<Mensajeria> getAllMensajes() {
        return mensajeriaRepository.findAll();
    }
}