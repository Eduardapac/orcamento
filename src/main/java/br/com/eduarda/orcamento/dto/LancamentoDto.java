package br.com.eduarda.orcamento.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LancamentoDto {

    private Long id;
    private String tipolancamento;
    private BigDecimal valorlancamento;

    public LancamentoDto(Long id, String tipolancamento, BigDecimal valorlancamento) {
        this.id = id;
        this.tipolancamento = tipolancamento;
        this.valorlancamento = valorlancamento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTipolancamento(String tipolancamento) {
        this.tipolancamento = tipolancamento;
    }

    public void setValorlancamento(BigDecimal valorlancamento) {
        this.valorlancamento = valorlancamento;
    }

    public Long getId() {
        return id;
    }

    public String getTipolancamento() {
        return tipolancamento;
    }

    public BigDecimal getValorlancamento() {
        return valorlancamento;
    }
}
