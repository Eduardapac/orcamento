package br.com.eduarda.orcamento.services;

import br.com.eduarda.orcamento.model.Cliente;
import br.com.eduarda.orcamento.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServece {

    @Autowired
    private ClienteRepository clienteRepository;
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
