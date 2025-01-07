package com.davifariasp.ocp.ex1.violacao;

public class Main {
    public static void main(String[] args) {
        Desconto desconto = new Desconto();

        double valorDesconto = desconto.calcularDesconto("natal", 100);

        System.out.println("Valor do desconto: " + valorDesconto);
    }
}