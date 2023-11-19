package backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.House;

import java.util.List;
import java.util.Optional;

public interface HouseRepository {
    House save(House house);
    Optional<House> findById(Long id);
    List<House> findAll();

    void deleteById(Long id);

    List<House> findByCountryAndCity(String country, String city);

    List<House> findByCountry(String country);

    List<House> findByCity(String city);
}
