package com.davifariasp.srp.ex1.violacao;

public class Main {
    public static void main(String[] args) {
        User user = new User("Davi", "davi@email.com");
        user.showUser();
        user.save();
        user.sendWelcomeEmail();
    }
}
