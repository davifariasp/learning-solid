package com.davifariasp.lsp.ex1.violacao;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else {
            super.sacar(valor);
        }
    }
}
