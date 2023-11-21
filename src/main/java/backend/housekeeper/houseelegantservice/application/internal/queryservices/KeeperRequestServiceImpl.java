package backend.housekeeper.houseelegantservice.application.internal.queryservices;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.KeeperRequest;
import backend.housekeeper.houseelegantservice.domain.model.query.GetKeeperRequestAllQuery;
import backend.housekeeper.houseelegantservice.domain.service.KeeperRequestQueryService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.KeeperRequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeeperRequestServiceImpl implements KeeperRequestQueryService {
    private final KeeperRequestRepository keeperRequestRepository;

    public KeeperRequestServiceImpl(KeeperRequestRepository keeperRequestRepository) {
        this.keeperRequestRepository = keeperRequestRepository;
    }

    @Override
    public List<KeeperRequest> handle(GetKeeperRequestAllQuery query) {
        return keeperRequestRepository.findAll();
    }
}
