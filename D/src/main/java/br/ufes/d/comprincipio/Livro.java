package br.ufes.d.comprincipio;

class Livro extends Produto {
    
    private final String autor;

    public Livro(String nome, String autor, int avaliacao) {
        super(nome, avaliacao);
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    
}
