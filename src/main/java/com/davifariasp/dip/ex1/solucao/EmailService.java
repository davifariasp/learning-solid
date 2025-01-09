package com.davifariasp.dip.ex1.solucao;

public class EmailService implements NotificationService {
    @Override
    public void enviarMensagem(String message) {
        System.out.println("Enviando email: " + message);
    }
}
