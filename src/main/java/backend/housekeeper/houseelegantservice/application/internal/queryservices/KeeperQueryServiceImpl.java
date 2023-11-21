package backend.housekeeper.houseelegantservice.application.internal.queryservices;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Keeper;
import backend.housekeeper.houseelegantservice.domain.model.query.GetKeeperAllQuery;
import backend.housekeeper.houseelegantservice.domain.service.KeeperQueryService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.KeeperRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeeperQueryServiceImpl implements KeeperQueryService {
    private final KeeperRepository keeperRepository;


    public KeeperQueryServiceImpl(KeeperRepository keeperRepository) {
        this.keeperRepository = keeperRepository;
    }

    @Override
    public List<Keeper> handle(GetKeeperAllQuery query) {
        return keeperRepository.findAll();
    }
}
