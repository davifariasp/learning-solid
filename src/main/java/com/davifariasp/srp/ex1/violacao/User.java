package com.davifariasp.srp.ex1.violacao;

public class User {
    public String nome;
    public String email;

    public User(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void showUser(){
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
    }

    public void save(){
        System.out.println("Salvando usuário no banco de dados...");
    }

    public void sendWelcomeEmail(){
        System.out.println("Enviando e-mail de boas-vindas...");
    }
}
