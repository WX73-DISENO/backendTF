package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.KeeperRequest;

import java.util.List;

public interface KeeperRequestQueryService {
    KeeperRequest getKeeperRequestById(Long requestId);
    List<KeeperRequest> getAllKeeperRequests();
}
