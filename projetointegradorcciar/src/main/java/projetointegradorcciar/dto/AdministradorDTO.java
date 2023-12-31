package projetointegradorcciar.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.validation.annotation.Validated;
import projetointegradorcciar.entity.Pessoa;

@Getter
@Setter
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class AdministradorDTO {

    private Long id;

    @NotNull(message = "Nome não pode ser nulo")
    @NotBlank(message = "Nome não estar ser em branco")
    @Size(max = 50, message = "Nome excede limite de caracteres")
    @Pattern(regexp = "^[a-zA-ZÀ-ÿ\\s]*$", message = "Nome não pode conter caracteres especiais")
    private String nomeAdm;

    @NotNull (message = "Login não pode ser nulo")
    @NotBlank (message = "Login não estar ser em branco")
    @Size (max = 50, message = "Login excede limite de caracteres")
    private String loginNome;

    @NotNull (message = "Telefone não pode ser nulo")
    @NotBlank (message = "Telefone não estar ser em branco")
    private String telefone;

    @NotNull (message = "Senha não pode ser nula")
    @NotBlank (message = "Senha não estar ser em branco")
    @Size (max = 50, message = "Senha excede limite de caracteres")
    private String senha;

    @NotNull (message = "E-mail não pode ser nulo")
    @NotBlank (message = "E-mail não estar ser em branco")
    @Size (max = 130, message = "E-mail excede limite de caracteres")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "E-mail em formato inválido")
    private String email;

    @NotNull (message = "E-mail de recuperação não pode ser nulo")
    @NotBlank (message = "E-mail de recuperação não estar ser em branco")
    @Size (max = 130, message = "E-mail de recuperação excede limite de caracteres")
    private String emailRecup;

    @NotNull (message = "CPF não pode ser nulo")
    @NotBlank (message = "CPF não pode estar em branco")
    @Size (max = 14, message = "CPF excede limite de caracteres")
    @CPF(message = "CPF inválido")
    private String cpf;
}
