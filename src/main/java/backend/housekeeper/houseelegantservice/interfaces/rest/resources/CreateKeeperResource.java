package backend.housekeeper.houseelegantservice.interfaces.rest.resources;

public record CreateKeeperResource(
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
