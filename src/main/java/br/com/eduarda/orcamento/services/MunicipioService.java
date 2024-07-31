package br.com.eduarda.orcamento.services;

import br.com.eduarda.orcamento.model.Municipio;
import br.com.eduarda.orcamento.repositories.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MunicipioService {

    @Autowired
    private MunicipioRepository municipioRepository;

    public Municipio salvar(Municipio municipio){
        return municipioRepository.save(municipio);
    }
}
