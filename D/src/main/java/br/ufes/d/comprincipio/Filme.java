package br.ufes.d.comprincipio;

public class Filme extends Produto {
    
    private final String diretor;

    public Filme(String nome, String diretor, int avaliacao) {
        super(nome, avaliacao);
        this.diretor = diretor;
    }
    
    public String getDiretor() {
        return diretor;
    }

}
