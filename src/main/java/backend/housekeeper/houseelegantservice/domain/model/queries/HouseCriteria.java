package backend.housekeeper.houseelegantservice.domain.model.queries;

public record HouseCriteria(String country, String city, double maxPrice, int minCapacity) {
    public boolean hasCountry() {
        return country != null && !country.isEmpty();
    }

    public boolean hasCity() {
        return city != null && !city.isEmpty();
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}