package backend.housekeeper.houseelegantservice.application.internal.commandservices;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.House;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateHouseCommand;
import backend.housekeeper.houseelegantservice.domain.model.command.UpdateHouseCommand;
import backend.housekeeper.houseelegantservice.domain.service.HouseCommandService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HouseCommandServiceImpl implements HouseCommandService {

    @Override
    public Long handle(CreateHouseCommand command) {
        return null;
    }

    @Override
    public Optional<House> handle(UpdateHouseCommand command) {
        return Optional.empty();
    }
}
