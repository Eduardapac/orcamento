package br.com.eduarda.orcamento.repositories.lancamento;

import br.com.eduarda.orcamento.dto.LancamentoDto;
import br.com.eduarda.orcamento.model.Lancamento;
import br.com.eduarda.orcamento.repositories.filter.LancamentoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LancamentoRepositoryQuery {
    public Page<LancamentoDto> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
}
