package backend.housekeeper.houseelegantservice.application.internal.commandservices;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.House;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateHouseCommand;
import backend.housekeeper.houseelegantservice.domain.model.command.UpdateHouseCommand;
import backend.housekeeper.houseelegantservice.domain.service.HouseCommandService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseCommandServiceImpl implements HouseCommandService {
    private final HouseRepository houseRepository;


    public HouseCommandServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }
    @Override
    public Long handle(CreateHouseCommand command) {
        return null;
    }

    @Override
    public void updateHouse(Long houseId, UpdateHouseCommand command) {
        House existingHouse = houseRepository.findById(houseId)
                .orElseThrow(() -> new HouseNotFoundException("House not found"));

        // Validar los datos del comando antes de actualizar la casa
        /*
        existingHouse.setCountry(command.country());
        existingHouse.setCity(command.city());
        existingHouse.setStreetAddress(command.streetAddress());
        existingHouse.setPrice(command.price());
        existingHouse.setRating(command.rating());
        existingHouse.setPhotoUrl(command.photoUrl());
        existingHouse.setCapacity(command.capacity());
        */

        existingHouse.setAddress(existingHouse.getAddress()); //no estoy seguro
        existingHouse.setPrice(command.price());
        existingHouse.setRating(command.rating());
        existingHouse.setPhotoUrl(command.photoUrl());
        existingHouse.setCapacity(command.capacity());

        houseRepository.save(existingHouse);
    }
    @Override
    public House createHouse(CreateHouseCommand command) {

        House newHouse = new House(command.country(), command.city(), command.streetAddress());

        /*
        setCountry(command.country());
        newHouse.setCity(command.city());
        newHouse.setStreetAddress(command.streetAddress());
        */

        newHouse.setAddress(newHouse.getAddress()); //no estoy seguro
        newHouse.setPrice(command.price());
        newHouse.setRating(command.rating());
        newHouse.setPhotoUrl(command.photoUrl());
        newHouse.setCapacity(command.capacity());

        return houseRepository.save(newHouse);
    }

    @Override
    public void deleteHouse(Long houseId) {
        // Verificar si la casa existe antes de intentar eliminar
        House existingHouse = houseRepository.findById(houseId)
                .orElseThrow(() -> new HouseNotFoundException("House not found"));

        houseRepository.deleteById(houseId);
    }
}
