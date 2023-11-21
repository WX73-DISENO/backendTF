package backend.housekeeper.houseelegantservice.domain.model.valueobjects;

public record KeeperName(String firstName,String lastName) {
    public KeeperName(){
        this(null, null);
    }

    public KeeperName{
        if (firstName == null || firstName.isBlank()){
            throw new IllegalArgumentException("FirstName cannot be null or blank");
        }
        if (lastName == null || lastName.isBlank()){
            throw new IllegalArgumentException("LastName cannot be null or blank");
        }
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

}
