package br.fiap.assistencia_tecnica.web.dto;

import br.fiap.assistencia_tecnica.domain.Cliente;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor @Data @Getter @Setter
public class equipamentoDTO {
    private Long id;
    private Cliente cliente;
    private String Tipo;
    private String modelo;
    private LocalDate dataCadastro;
}
