package backend.housekeeper.houseelegantservice.domain.service;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.House;
import backend.housekeeper.houseelegantservice.domain.model.query.GetHouseAllQuery;

import java.util.List;

public interface HouseQueryService {
    List<House> handle(GetHouseAllQuery query);
}
