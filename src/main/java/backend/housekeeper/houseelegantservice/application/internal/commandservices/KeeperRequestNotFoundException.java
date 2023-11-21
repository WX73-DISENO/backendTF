package backend.housekeeper.houseelegantservice.application.internal.commandservices;

public class KeeperRequestNotFoundException extends RuntimeException {
    public KeeperRequestNotFoundException(String message) {
        super(message);
    }
}