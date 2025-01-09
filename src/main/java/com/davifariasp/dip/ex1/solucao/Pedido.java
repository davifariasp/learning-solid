package com.davifariasp.dip.ex1.solucao;

public class Pedido {
    private NotificationService notificationService;

    public Pedido(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void confirmarPedido() {
        System.out.println("Pedido confirmado!");
        notificationService.enviarMensagem("Pedido confirmado!");
    }
}
