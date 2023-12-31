package projetointegradorcciar.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
    @NotNull(message = "E-mail não pode ser nulo")
    @Size(max = 150, message = "Limite máximo de caracters atingidos para e-mail")
    private String email;
    @NotNull (message = "Senha não pode ser nula")
    @Size (max = 150, message = "Limite máximo de caracters atingidos para senha")
    private String senha;
    public LoginDTO (){}
}
