package br.ufes.reusoporcomposicao.exemplo2.semprincipio;

public class Cliente extends Pessoa {

    private final long idCliente;

    public Cliente(long idCliente, String nome) {
        super(nome);
        this.idCliente = idCliente;
    }

    public long getIdCliente() {
        return idCliente;
    }

}
