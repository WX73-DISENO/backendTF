package backend.housekeeper.houseelegantservice.application.internal.queryservices;

import backend.housekeeper.houseelegantservice.application.internal.commandservices.HouseNotFoundException;
import backend.housekeeper.houseelegantservice.domain.model.aggregates.House;
import backend.housekeeper.houseelegantservice.domain.model.queries.GetHouseByIdQuery;
import backend.housekeeper.houseelegantservice.domain.model.queries.HouseCriteria;
import backend.housekeeper.houseelegantservice.domain.service.HouseQueryService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.HouseRepository;

import java.util.List;
import java.util.Optional;

public class HouseQueryServiceImpl implements HouseQueryService {
    private final HouseRepository houseRepository;

    public HouseQueryServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public Optional<House> handle(GetHouseByIdQuery query) {
        return Optional.empty();
    }

    @Override
    public House getHouseById(Long houseId) {
        // Retorna la casa si existe, de lo contrario, lanza una excepción
        return houseRepository.findById(houseId)
                .orElseThrow(() -> new HouseNotFoundException("House not found"));
    }

    @Override
    public List<House> getAllHouses() {
        return houseRepository.findAll();
    }

    public List<House> getHousesByCriteria(HouseCriteria criteria) {
        // Implementa la lógica para filtrar casas según los criterios proporcionados

        // Ejemplo básico: Filtrar por país y ciudad
        if (criteria.hasCountry() && criteria.hasCity()) {
            return houseRepository.findByCountryAndCity(criteria.getCountry(), criteria.getCity());
        } else if (criteria.hasCountry()) {
            // Filtrar solo por país
            return houseRepository.findByCountry(criteria.getCountry());
        } else if (criteria.hasCity()) {
            // Filtrar solo por ciudad
            return houseRepository.findByCity(criteria.getCity());
        } else {
            // Sin criterios, obtener todas las casas
            return houseRepository.findAll();
        }
    }
}
