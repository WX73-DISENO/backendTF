package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.KeeperRequest;
import backend.housekeeper.houseelegantservice.domain.model.query.GetKeeperRequestAllQuery;

import java.util.List;

public interface KeeperRequestQueryService {


    List<KeeperRequest> handle(GetKeeperRequestAllQuery query);
}
