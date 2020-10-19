package br.ufes.dry.semprincipio;

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
        if (this.saldo <= valor) {
            this.saldo -= valor;
        } else {
            throw new RuntimeException("Saldo indiponível");
        }
        contaDestino.depositar(valor);
    }

}
