package com.davifariasp.ocp.ex1.violacao;

// Classe Original

//public class Desconto {
//    public double calcularDesconto(String tipo, double valor){
//        if(tipo.equals("blackFriday")){
//            return valor * 0.1;
//        }else if(tipo.equals("natal")){
//            return valor * 0.2;
//        }else{
//            return 0;
//        }
//    }
//}

// Classe Modificada

public class Desconto {
    public double calcularDesconto(String tipo, double valor){
        if(tipo.equals("blackFriday")){
            return valor * 0.1;
        }else if(tipo.equals("natal")){
            return valor * 0.2;
        }else if(tipo.equals("pascoa")){
            return valor * 0.15;
        }else{
            return 0;
        }
    }
}
