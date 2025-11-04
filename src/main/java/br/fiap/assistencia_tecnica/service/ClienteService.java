package br.fiap.assistencia_tecnica.service;

import br.fiap.assistencia_tecnica.Config.SenhaConfig;
import br.fiap.assistencia_tecnica.domain.Cliente;
import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.repository.ClienteRepository;
import br.fiap.assistencia_tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia_tecnica.web.dto.ClienteRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @AllArgsConstructor
public class ClienteService {
    private ClienteRepository repository;
    private EquipamentoRepository equipamentoRepository;
    private SenhaConfig encoder;

    public Cliente salvar(ClienteRequest requisicao) {
        Cliente cliente = new Cliente();
        cliente.setNome(requisicao.getNome());
        cliente.setEmail(requisicao.getEmail());
        cliente.setTelefone(requisicao.getTelefone());
        cliente.setSenha(encoder.hashear().encode(requisicao.getSenha()));
        return repository.save(cliente);
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Equipamento> listarEquipamentos(long id) {return equipamentoRepository.findByClienteId(id);}


}
