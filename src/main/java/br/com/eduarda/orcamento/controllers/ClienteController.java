package br.com.eduarda.orcamento.controllers;

import br.com.eduarda.orcamento.model.Cliente;
import br.com.eduarda.orcamento.services.ClienteServece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteServece clienteServece;

    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        Cliente clienteSalva = clienteServece.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalva);
    }
}
