package br.ufes.d.semprincipio;

class Livro {
    
    private final String nome;
    private final String autor;
    private int avaliacao;

    public Livro(String nome, String autor, int avaliacao) {
        this.nome = nome;
        this.autor = autor;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
    
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    
}
