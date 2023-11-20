package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Keeper;
import backend.housekeeper.houseelegantservice.domain.model.command.UpdateKeeperProfileCommand;

import java.util.Optional;

public interface KeeperCommandService {


    Optional<Keeper> handle(UpdateKeeperProfileCommand command);
}
