package backend.housekeeper.houseelegantservice.application.internal.queryservices;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;
import backend.housekeeper.houseelegantservice.domain.model.queries.GetViajeAllQuery;
import backend.housekeeper.houseelegantservice.domain.service.ViajeQueryService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.ViajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViajeQueryServiceImpl implements ViajeQueryService {
    private ViajeRepository viajeRepository;

    @Override
    public List<Viaje> handle(GetViajeAllQuery query) {
        return viajeRepository.findAll();
    }
}
