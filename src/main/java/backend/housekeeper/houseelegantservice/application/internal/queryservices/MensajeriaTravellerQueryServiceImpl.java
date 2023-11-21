package backend.housekeeper.houseelegantservice.application.internal.queryservices;

import backend.housekeeper.houseelegantservice.application.internal.commandservices.MensajeriaNotFoundException;
import backend.housekeeper.houseelegantservice.application.internal.commandservices.MensajeriaTravellerNotFoundException;
import backend.housekeeper.houseelegantservice.domain.model.aggregates.Mensajeria;
import backend.housekeeper.houseelegantservice.domain.model.aggregates.MensajeriaTraveller;
import backend.housekeeper.houseelegantservice.domain.service.MensajeriaTravellerQueryService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.MensajeriaRepository;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.MensajeriaTravellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajeriaTravellerQueryServiceImpl implements MensajeriaTravellerQueryService {
    private final MensajeriaTravellerRepository mensajeriaTravellerRepository;

    @Autowired
    public MensajeriaTravellerQueryServiceImpl(MensajeriaTravellerRepository mensajeriaTravellerRepository) {
        this.mensajeriaTravellerRepository = mensajeriaTravellerRepository;
    }

    @Override
    public MensajeriaTraveller getMensajeriaTravellerById(Long mensajeriaTravelleId) {
        return mensajeriaTravellerRepository.findById(mensajeriaTravelleId)
                .orElseThrow(() -> new MensajeriaTravellerNotFoundException("Mensajeria not found"));
    }

    @Override
    public List<MensajeriaTraveller> getAllMensajes() {
        return mensajeriaTravellerRepository.findAll();
    }
}
