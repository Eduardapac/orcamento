package br.com.eduarda.orcamento.repositories;

import br.com.eduarda.orcamento.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {
}
