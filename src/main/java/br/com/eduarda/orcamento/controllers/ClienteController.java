package br.com.eduarda.orcamento.controllers;

import br.com.eduarda.orcamento.model.Cliente;
import br.com.eduarda.orcamento.repositories.ClienteRepository;
import br.com.eduarda.orcamento.services.ClienteServece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteServece clienteServece;

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping()
    public List<Cliente> listarTodosClientes(){
        return clienteRepository.findAll(Sort.by("nome").ascending());
    }

    @PostMapping()
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        Cliente clienteSalva = clienteServece.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalva);
    }
}
