package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.Endereco;

public record DadosCadastroMedico(
        @NotNull @NotBlank String nome,

        @NotBlank @Email String email,

        @NotBlank @Pattern(regexp = "\\d{4,6}") String crm,

        @NotNull Especialidade especialidade,

        @NotBlank String telefone,

        @NotNull @Valid Endereco endereco) {
}