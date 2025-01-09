package com.davifariasp.dip.ex1.violacao;

public class Pedido {
    private EmailService emailService = new EmailService();

    public void confirmarPedido(){
        // Lógica para confirmar o pedido
        emailService.enviarEmail("pedido confirmado!");
    }
}
