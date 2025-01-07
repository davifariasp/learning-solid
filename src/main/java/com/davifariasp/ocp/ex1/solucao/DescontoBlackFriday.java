package com.davifariasp.ocp.ex1.solucao;

public class DescontoBlackFriday implements Desconto {
    @Override
    public double calcular(double valor) {
        return valor * 0.1;
    }
}
