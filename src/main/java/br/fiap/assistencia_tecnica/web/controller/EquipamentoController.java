package br.fiap.assistencia_tecnica.web.controller;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.service.EquipamentoService;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/equipamento")
public class EquipamentoController {
    @Autowired
    private EquipamentoService service;
    EquipamentoController(EquipamentoService service){
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Equipamento criar(@RequestBody EquipamentoDTO equipamentoDTO){
        return service.criar(equipamentoDTO);
    }

    @GetMapping("/{id}")
    public Equipamento buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }
}
