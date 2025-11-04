package br.fiap.assistencia_tecnica.web.controller;

import br.fiap.assistencia_tecnica.domain.Cliente;
import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia_tecnica.service.ClienteService;
import br.fiap.assistencia_tecnica.web.dto.ClienteRequest;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente") @Data @AllArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente criar(@RequestBody ClienteRequest requisicao) {
        return service.salvar(requisicao);
    }

    @GetMapping
    public List<Cliente> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Cliente buscaPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @GetMapping("/{id}/equipamento")
    public List<Equipamento> listarEquipamentos(@PathVariable long id){
        return service.listarEquipamentos(id);
    }
}
