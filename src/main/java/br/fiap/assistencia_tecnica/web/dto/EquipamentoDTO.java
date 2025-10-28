package br.fiap.assistencia_tecnica.web.dto;

import br.fiap.assistencia_tecnica.domain.Cliente;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor @Data
public class EquipamentoDTO {
    private Long id;
    private Cliente cliente;
    private String Tipo;
    private String modelo;
    private LocalDate dataCadastro;
    private String numeroSerie;
}
