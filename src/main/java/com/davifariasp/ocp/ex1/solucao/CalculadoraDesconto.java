package com.davifariasp.ocp.ex1.solucao;

public class CalculadoraDesconto {
    public double calcularDesconto(Desconto tipo, double valor) {
        return tipo.calcular(valor);
    }
}
