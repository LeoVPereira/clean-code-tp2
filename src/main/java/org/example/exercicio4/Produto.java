package org.example.exercicio4;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // construtor de cópia simples
    public Produto(Produto outro) {
        this.nome = outro.nome;
        this.preco = outro.preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // setter liberado somente para a cópia manipulada
    public void setPreco(double preco) {
        this.preco = preco;
    }
}

