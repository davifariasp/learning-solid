package com.davifariasp.dip.ex1.solucao;

public class SmsService implements NotificationService {
    @Override
    public void enviarMensagem(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
