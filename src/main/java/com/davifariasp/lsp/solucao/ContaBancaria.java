package com.davifariasp.lsp.solucao;

abstract class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor) throws IllegalArgumentException;

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
