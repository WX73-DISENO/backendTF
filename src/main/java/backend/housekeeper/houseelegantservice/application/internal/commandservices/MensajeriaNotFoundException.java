package backend.housekeeper.houseelegantservice.application.internal.commandservices;

public class MensajeriaNotFoundException extends RuntimeException {
    public MensajeriaNotFoundException(String message) {
        super(message);
    }
}