package org.example.exercicio3;

public class ClienteReal implements Cliente {
    private String nome;
    public ClienteReal(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
