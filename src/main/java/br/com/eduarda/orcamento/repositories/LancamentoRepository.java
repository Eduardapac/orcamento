package br.com.eduarda.orcamento.repositories;

import br.com.eduarda.orcamento.model.Lancamento;
import br.com.eduarda.orcamento.repositories.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Integer>, LancamentoRepositoryQuery {
}
