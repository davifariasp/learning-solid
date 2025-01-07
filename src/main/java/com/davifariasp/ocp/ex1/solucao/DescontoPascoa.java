package com.davifariasp.ocp.ex1.solucao;

public class DescontoPascoa implements Desconto{
    @Override
    public double calcular(double valor) {
        return valor * 0.15;
    }
}
