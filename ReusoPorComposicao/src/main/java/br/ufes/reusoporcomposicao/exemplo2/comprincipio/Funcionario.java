package br.ufes.reusoporcomposicao.exemplo2.comprincipio;

import br.ufes.reusoporcomposicao.exemplo2.semprincipio.*;

public class Funcionario extends Pessoa {

    private String cargo;

    public Funcionario(String cargo, String nome) {
        super(nome);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
