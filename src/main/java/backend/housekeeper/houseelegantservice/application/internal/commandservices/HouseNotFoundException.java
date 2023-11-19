package backend.housekeeper.houseelegantservice.application.internal.commandservices;

public class HouseNotFoundException extends RuntimeException {
    public HouseNotFoundException(String message) {
        super(message);
    }
}