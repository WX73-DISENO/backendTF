package backend.housekeeper.houseelegantservice.domain.model.valueobjects;

import jakarta.persistence.Embeddable;


import jakarta.validation.constraints.Pattern;

@Embeddable
public record Password(
        @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$",
                message = "La contraseña debe tener al menos 8 caracteres, incluyendo al menos un dígito, una letra minúscula, una letra mayúscula y un carácter especial.")
        String password) {

    public Password() {
        this(null);
    }
}

