package br.com.eduarda.orcamento.services;

import br.com.eduarda.orcamento.model.Lancamento;
import br.com.eduarda.orcamento.repositories.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento){
        return lancamentoRepository.save(lancamento);
    }
}
