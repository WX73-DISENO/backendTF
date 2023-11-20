package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Keeper;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateKeeperCommand;
import backend.housekeeper.houseelegantservice.domain.model.queries.GetKeeperAllQuery;

import java.util.List;
import java.util.Optional;

public interface KeeperQueryService {

        List<Keeper> handle(GetKeeperAllQuery query);
}
