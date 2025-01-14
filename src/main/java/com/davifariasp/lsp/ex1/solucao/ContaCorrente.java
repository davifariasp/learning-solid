package com.davifariasp.lsp.ex1.solucao;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo() - valor);
    }
}
