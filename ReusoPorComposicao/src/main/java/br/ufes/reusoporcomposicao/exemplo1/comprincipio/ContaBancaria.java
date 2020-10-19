package br.ufes.reusoporcomposicao.exemplo1.comprincipio;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSacar) {
        if (this.saldo <= valorSacar) {
            this.saldo -= valorSacar;
        } else {
            throw new RuntimeException("Saldo indiponível");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

}
