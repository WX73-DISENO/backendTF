package backend.housekeeper.houseelegantservice.domain.model.valueobjects;

import jakarta.persistence.Embeddable;


@Embeddable
public record StreetAddress(
        String street,
        String city,

        String country
) {
    public StreetAddress() {
        this(null, null, null);
    }

    public StreetAddress {
        if (street == null || street.isBlank()) {
            throw new IllegalArgumentException("Street cannot be null or blank");
        }
        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException("City cannot be null or blank");
        }
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("Country cannot be null or blank");
        }
    }






    public String getStreetAddress() {
        return street + " "+ city+ " "+ country;
    }
}

