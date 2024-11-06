package br.com.eduarda.orcamento.repositories.filter;

public class ClienteFilter {

    private String nome;
    private String endereco;
    private String numero;

    public ClienteFilter(String nome, String endereco, String numero, String bairro) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
