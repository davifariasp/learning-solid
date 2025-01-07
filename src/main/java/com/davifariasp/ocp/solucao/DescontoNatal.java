package com.davifariasp.ocp.solucao;

public class DescontoNatal implements Desconto {
    @Override
    public double calcular(double valor) {
        return valor * 0.2;
    }
}
