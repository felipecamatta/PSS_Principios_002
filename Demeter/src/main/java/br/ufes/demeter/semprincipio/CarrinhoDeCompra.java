package br.ufes.demeter.semprincipio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    
    private List<Item> itens;
    
    public CarrinhoDeCompra() {
        this.itens = new ArrayList<>();    
    }
    
    // Fere a Lei de Demeter pois estamos fazendo acesso ao atributo de um obejto q n faz parte dessa classe
    public double calcularValorTotal() {
        double total = 0.00;
        for(Item item : itens) {
            total += item.getProduto().getValor() * item.getQuantidade();
        }
        return total;
    }
    
}
