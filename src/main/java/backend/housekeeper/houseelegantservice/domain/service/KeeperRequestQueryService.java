package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Keeper;
import backend.housekeeper.houseelegantservice.domain.model.aggregates.KeeperRequest;
import backend.housekeeper.houseelegantservice.domain.model.queries.GetKeeperAllQuery;
import backend.housekeeper.houseelegantservice.domain.model.queries.GetKeeperRequestAllQuery;

import java.util.List;
import java.util.Optional;

public interface KeeperRequestQueryService {


    List<KeeperRequest> handle(GetKeeperRequestAllQuery query);
}
