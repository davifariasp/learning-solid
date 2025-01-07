package com.davifariasp.ocp.ex1.solucao;

public class Main {
    public static void main(String[] args) {

        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        //tipos de desconto
        DescontoNatal descontoNatal = new DescontoNatal();
        DescontoPascoa descontoPascoa = new DescontoPascoa();
        DescontoBlackFriday descontoBlackFriday = new DescontoBlackFriday();

        System.out.println("Desconto de Natal: " + calculadora.calcularDesconto(descontoNatal, 100));
        System.out.println("Desconto de Páscoa: " + calculadora.calcularDesconto(descontoPascoa, 100));
        System.out.println("Desconto de Black Friday: " + calculadora.calcularDesconto(descontoBlackFriday, 100));
    }
}
