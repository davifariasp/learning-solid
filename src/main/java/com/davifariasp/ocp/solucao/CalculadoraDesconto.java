package com.davifariasp.ocp.solucao;

public class CalculadoraDesconto {
    public double calcularDesconto(Desconto tipo, double valor) {
        return tipo.calcular(valor);
    }
}
