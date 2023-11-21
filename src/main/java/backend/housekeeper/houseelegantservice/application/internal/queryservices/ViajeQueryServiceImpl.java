package backend.housekeeper.houseelegantservice.application.internal.queryservices;

import backend.housekeeper.houseelegantservice.application.internal.commandservices.ViajeNotFoundException;
import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;
import backend.housekeeper.houseelegantservice.domain.service.ViajeQueryService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeQueryServiceImpl implements ViajeQueryService {

    private final ViajeRepository viajeRepository;

    @Autowired
    public ViajeQueryServiceImpl(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @Override
    public Viaje getViajeById(Long viajeId) {
        return viajeRepository.findById(viajeId)
                .orElseThrow(() -> new ViajeNotFoundException("Viaje not found"));
    }

    @Override
    public List<Viaje> getAllViajes() {
        return viajeRepository.findAll();
    }


}