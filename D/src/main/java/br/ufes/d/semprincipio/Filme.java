package br.ufes.d.semprincipio;

public class Filme {

    private final String nome;
    private final String diretor;
    private int avaliacao;

    public Filme(String nome, String diretor, int avaliacao) {
        this.nome = nome;
        this.diretor = diretor;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

}
