package org.example.exercicio2;

public class Desconto {
    public static double calcular(double preco) {
        return preco > 1000 ? preco * 0.9 : preco;
    }
}
