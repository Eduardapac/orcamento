package br.com.eduarda.orcamento.repositories.municipio;

import br.com.eduarda.orcamento.model.Municipio;
import br.com.eduarda.orcamento.repositories.filter.MunicipioFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MunicipioRepositoryQuery {
    public Page<Municipio> filtrar(MunicipioFilter municipioFilter, Pageable pageable);
}
