package org.example.exercicio4;

public class Ajuste {
    public Produto aplicarDesconto(Produto produto) {
        Produto copia = new Produto(produto);  // cria uma cópia segura
        copia.setPreco(copia.getPreco() - 10); // aplica o desconto só na cópia
        return copia;                          // retorna a versão ajustada
    }
}
