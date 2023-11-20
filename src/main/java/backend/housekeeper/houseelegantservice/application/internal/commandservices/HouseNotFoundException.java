package backend.housekeeper.houseelegantservice.application.internal.commandservices;

import org.springframework.stereotype.Service;


public class HouseNotFoundException extends RuntimeException {
    public HouseNotFoundException(String message) {
        super(message);
    }
}