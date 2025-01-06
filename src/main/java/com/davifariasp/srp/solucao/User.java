package com.davifariasp.srp.solucao;

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
}

