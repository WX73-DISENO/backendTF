package backend.housekeeper.houseelegantservice.application.internal.queryservices;

import backend.housekeeper.houseelegantservice.application.internal.commandservices.KeeperRequestNotFoundException;
import backend.housekeeper.houseelegantservice.domain.model.aggregates.KeeperRequest;
import backend.housekeeper.houseelegantservice.domain.service.KeeperRequestQueryService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.KeeperRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KeeperRequestQueryServiceImpl implements KeeperRequestQueryService {

    private final KeeperRequestRepository keeperRequestRepository;

    @Autowired
    public KeeperRequestQueryServiceImpl(KeeperRequestRepository keeperRequestRepository) {
        this.keeperRequestRepository = keeperRequestRepository;
    }

    @Override
    public KeeperRequest getKeeperRequestById(Long requestId) {
        return keeperRequestRepository.findById(requestId)
                .orElseThrow(() -> new KeeperRequestNotFoundException("KeeperRequest not found"));
    }

    @Override
    public List<KeeperRequest> getAllKeeperRequests() {
        return keeperRequestRepository.findAll();
    }
}