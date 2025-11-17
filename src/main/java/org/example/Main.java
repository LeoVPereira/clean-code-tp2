package org.example;

import org.example.exercicio1.SomaEDuplica;
import org.example.exercicio2.Desconto;

public class Main {
    public static void main(String[] args) {

        //Exercício 1:
        int resultado = SomaEDuplica.duplicarSoma(5,10);
        System.out.println(resultado);

        //Exercício 2:
        double precoComDesconto = Desconto.calcular(1001.00);
        System.out.println(precoComDesconto);

    }
}