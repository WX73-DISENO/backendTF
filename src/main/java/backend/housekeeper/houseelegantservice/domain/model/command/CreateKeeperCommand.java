package backend.housekeeper.houseelegantservice.domain.model.command;

public record CreateKeeperCommand(
        String password,
        String name,
        String country,
        String city,
        String streetAddress,
        String description,
        String email,
        String photoUrl,
        String rating
) {
}
