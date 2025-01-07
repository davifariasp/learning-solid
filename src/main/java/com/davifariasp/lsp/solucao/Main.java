package com.davifariasp.lsp.solucao;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(100);
        ContaPoupanca contaPoupanca = new ContaPoupanca(100);

        realizarSaque(contaCorrente, 150);
        realizarSaque(contaPoupanca, 150);
    }

    public static void realizarSaque(ContaBancaria conta, double valor) {
        conta.sacar(valor);
        System.out.println("Saque realizado com sucesso. Saldo atual: " + conta.getSaldo());
    }
}
