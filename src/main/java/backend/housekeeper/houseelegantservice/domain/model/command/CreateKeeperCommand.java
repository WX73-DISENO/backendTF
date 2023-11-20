package backend.housekeeper.houseelegantservice.domain.model.command;

public record CreateKeeperCommand(String firstName, String lastName, String description, String street,
                                  String city,String country) {
}
