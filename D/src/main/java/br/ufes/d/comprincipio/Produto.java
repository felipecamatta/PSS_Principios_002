package br.ufes.d.comprincipio;

public class Produto {

    private final String nome;
    private int avaliacao;

    public Produto(String nome, int avaliacao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

}
