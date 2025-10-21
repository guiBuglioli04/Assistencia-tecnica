package br.fiap.assistencia_tecnica.service;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoService {
    @Autowired
    private EquipamentoRepository repository;
    public Equipamento criar(Equipamento equipamento) {
        return repository.save(equipamento);
    }
}
