package br.ufes.d.semprincipio;

import java.util.ArrayList;
import java.util.List;

public class Estante {
    
    private List<Livro> livros = new ArrayList<>();
    
    // Estante não pode ter filme?
    public void addLivro(Livro livro) {
        livros.add(livro);
    }
    
}
