package br.com.eduarda.orcamento.repositories;

import br.com.eduarda.orcamento.model.Cliente;
import br.com.eduarda.orcamento.repositories.cliente.ClienteRepositoryQuery;
import br.com.eduarda.orcamento.repositories.filter.ClienteFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer>, ClienteRepositoryQuery {
}
