package br.com.eduarda.orcamento.services;

import br.com.eduarda.orcamento.model.Municipio;
import br.com.eduarda.orcamento.repositories.MunicipioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MunicipioService {

    @Autowired
    private MunicipioRepository municipioRepository;

    public Municipio salvar(Municipio municipio){
        return municipioRepository.save(municipio);
    }

    public Municipio atualizar(Integer id, Municipio municipio){
        Municipio municipioSalva = buscarMunicipioExixstente(id);

        BeanUtils.copyProperties(municipio, municipioSalva, "id");

        return  municipioRepository.save(municipioSalva);
    }
    private Municipio buscarMunicipioExixstente(Integer id) {
        Optional<Municipio> municipioSalva = municipioRepository.findById(id);

        if(!municipioSalva.isPresent()) {
            throw new IllegalArgumentException();
        }
        return municipioSalva.get();
    }
}
