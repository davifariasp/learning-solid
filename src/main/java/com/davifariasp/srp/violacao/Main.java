package com.davifariasp.srp.violacao;

public class Main {
    public static void main(String[] args) {
        User user = new User("Davi", "davi@email.com");
        user.showUser();
        user.save();
        user.sendWelcomeEmail();
    }
}
