package br.com.eduarda.orcamento.controllers;

import br.com.eduarda.orcamento.model.Municipio;
import br.com.eduarda.orcamento.services.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/municipios")

public class MunicipioController {

   @Autowired
   private MunicipioService municipioService;
    @PostMapping()
   public ResponseEntity<Municipio> inserir(@RequestBody Municipio municipio){
       Municipio municipioSalvar = municipioService.salvar(municipio);
       return ResponseEntity.status(HttpStatus.CREATED).body(municipioSalvar);
   }
}
