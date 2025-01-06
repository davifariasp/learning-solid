package com.davifariasp.srp.solucao;

public class Main {
    public static void main(String[] args) {
        User user = new User("Davi", "davi@email.com");
        user.showUser();

        UserRepository userRepository = new UserRepository();
        EmailService emailService = new EmailService();

        userRepository.save();
        emailService.sendWelcomeEmail();

        userRepository.delete();
    }
}
