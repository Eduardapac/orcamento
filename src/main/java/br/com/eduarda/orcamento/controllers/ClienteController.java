package br.com.eduarda.orcamento.controllers;

import br.com.eduarda.orcamento.dto.ClienteDto;
import br.com.eduarda.orcamento.model.Cliente;
import br.com.eduarda.orcamento.repositories.ClienteRepository;
import br.com.eduarda.orcamento.repositories.filter.ClienteFilter;
import br.com.eduarda.orcamento.services.ClienteServece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteServece clienteServece;

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping()
    public Page<ClienteDto> pesquisar(ClienteFilter clienteFilter, Pageable pageable){
        return clienteRepository.filtrar(clienteFilter, pageable);
    }
    @GetMapping("/todas")
    public List<Cliente> listarTodosClientes(){
        return clienteRepository.findAll(Sort.by("nome").ascending());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPeloCodigo(@PathVariable int id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.isPresent() ? ResponseEntity.ok(cliente.get()): ResponseEntity.notFound() .build();
    }

    @PostMapping()
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        Cliente clienteSalva = clienteServece.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalva);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable int id){clienteRepository.deleteById(id);}

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Integer id, @RequestBody Cliente cliente){
        Cliente clienteSalva = clienteServece.atualizar(id, cliente);
        return ResponseEntity.ok(clienteSalva);
    }
}