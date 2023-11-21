package backend.housekeeper.houseelegantservice.domain.model.command;

public record UpdateViajeCommand(String title, String description, String photoUrl, float rating) {
}
