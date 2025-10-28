package br.fiap.assistencia_tecnica.service;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.repository.ClienteRepository;
import br.fiap.assistencia_tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service @Data
public class EquipamentoService {
    @Autowired
    private final EquipamentoRepository repository;
    private final ClienteRepository clienteRepository;

    public Equipamento criar(EquipamentoDTO equipamentoDTO) {
        var cliente = clienteRepository.findById(equipamentoDTO.getCliente().getId()).orElseThrow(() -> new NoSuchElementException("Cliente não localizado"));
        var equipamento = new Equipamento();
        equipamento.setModelo(equipamentoDTO.getModelo());
        equipamento.setTipo(equipamentoDTO.getTipo());
        equipamento.setNumeroSerie(equipamentoDTO.getNumeroSerie());
        equipamento.setDataCadastro(equipamentoDTO.getDataCadastro());
        equipamento.setCliente(cliente);
        return repository.save(equipamento);
    }

    public Equipamento buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new NoSuchElementException("Equipamento não encontrado"));
    }
}
