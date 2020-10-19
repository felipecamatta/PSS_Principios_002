package br.ufes.dry.comprincipio;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSacar) {
        diminuirValor(valorSacar);
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        diminuirValor(valor);
        contaDestino.depositar(valor);
    }

    private void diminuirValor(double valor) {
        if (this.saldo <= valor) {
            this.saldo -= valor;
        } else {
            throw new RuntimeException("Saldo indiponível");
        }
    }

}
