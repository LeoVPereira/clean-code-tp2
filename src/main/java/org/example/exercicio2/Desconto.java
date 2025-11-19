package org.example.exercicio2;

public class Desconto {
    private static final double TAXA_DESCONTO = 0.9;
    private static final double VALOR_MINIMO = 1000;
    public static double calcular(double preco) {
        double valorComDesconto = 0;
        if (preco >= VALOR_MINIMO) {
            valorComDesconto = preco * TAXA_DESCONTO;
        }
        return valorComDesconto;
    }
}
