package com.davifariasp.lsp.solucao;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor > getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else {
            setSaldo(getSaldo() - valor);
        }
    }
}
