package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Keeper;

import java.util.Optional;

public interface KeeperQueryService {

        Optional<Keeper> handle(GetKeeperAllQuery query);
}
