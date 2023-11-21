package backend.housekeeper.houseelegantservice.application.internal.commandservices;

public class ViajeNotFoundException extends RuntimeException {
    public ViajeNotFoundException(String message) {
        super(message);
    }
}