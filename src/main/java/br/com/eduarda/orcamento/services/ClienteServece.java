package br.com.eduarda.orcamento.services;

import br.com.eduarda.orcamento.model.Cliente;
import br.com.eduarda.orcamento.repositories.ClienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServece {

    @Autowired
    private ClienteRepository clienteRepository;
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(Integer id, Cliente cliente){
        Cliente clienteSalva = buscarCategoriaExixstente(id);

        BeanUtils.copyProperties(cliente, clienteSalva, "id");

        return  clienteRepository.save(clienteSalva);
    }
    private Cliente buscarCategoriaExixstente(Integer id) {
        Optional<Cliente> clienteSalva = clienteRepository.findById(id);

        if(!clienteSalva.isPresent()) {
            throw new IllegalArgumentException();
        }
        return clienteSalva.get();
    }
}
