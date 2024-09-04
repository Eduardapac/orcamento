package br.com.eduarda.orcamento.controllers;

import br.com.eduarda.orcamento.model.Municipio;
import br.com.eduarda.orcamento.repositories.MunicipioRepository;
import br.com.eduarda.orcamento.services.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/municipios")

public class MunicipioController {

   @Autowired
   private MunicipioService municipioService;

   @Autowired
   private MunicipioRepository municipioRepository;

   @GetMapping()
   public List<Municipio> listarTodosMunicipios(){
       return municipioRepository.findAll(Sort.by("nome").ascending());
   }

    @GetMapping("/{id}")
    public ResponseEntity<Municipio> buscarPeloCodigo(@PathVariable int id){
        Optional<Municipio> municipio = municipioRepository.findById(id);
        return municipio.isPresent() ? ResponseEntity.ok(municipio.get()): ResponseEntity.notFound() .build();
    }

   @PostMapping()
   public ResponseEntity<Municipio> inserir(@RequestBody Municipio municipio){
       Municipio municipioSalvar = municipioService.salvar(municipio);
       return ResponseEntity.status(HttpStatus.CREATED).body(municipioSalvar);
   }
}
