package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,
        @NotBlank
        String logradouro,
        @NotBlank
        String cidade,
        @NotBlank
        String bairro,
        String numero,
        @NotBlank
        String uf,
        String complemento) {
}
