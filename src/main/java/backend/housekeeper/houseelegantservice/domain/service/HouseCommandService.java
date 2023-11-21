package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.House;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateHouseCommand;
import backend.housekeeper.houseelegantservice.domain.model.command.UpdateHouseCommand;

public interface HouseCommandService {
    Long handle(CreateHouseCommand command);
    House createHouse(CreateHouseCommand command);
    void updateHouse(Long houseId, UpdateHouseCommand command);
    void deleteHouse(Long houseId);
}
