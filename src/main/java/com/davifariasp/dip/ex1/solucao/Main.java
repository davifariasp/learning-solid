package com.davifariasp.dip.ex1.solucao;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(new EmailService());
        Pedido pedido2 = new Pedido(new SmsService());

        pedido1.confirmarPedido();
        pedido2.confirmarPedido();
    }
}
