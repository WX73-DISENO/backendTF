package backend.housekeeper.houseelegantservice.domain.model.valueobjects;


import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Embeddable
public record PasswordRepeat(
        @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$",
                message = "La contraseña debe tener al menos 8 caracteres, incluyendo al menos un dígito, una letra minúscula, una letra mayúscula y un carácter especial.")
        @NotEmpty(message = "La contraseña no puede estar vacía")
        String password,
        @NotEmpty(message = "La contraseña de repetición no puede estar vacía")
        String repeatPassword) {

    public PasswordRepeat() {
        this(null, null);
    }
}
