package org.example;

import org.example.exercicio1.SomaEDuplica;
import org.example.exercicio2.Desconto;
import org.example.exercicio3.ClienteReal;
import org.example.exercicio3.Pedido;
import org.example.exercicio4.Ajuste;
import org.example.exercicio4.Produto;
import org.example.exercicio5.ClienteClassificador;

public class Main {
    public static void main(String[] args) {

        //Exercício 1:
        int resultado = SomaEDuplica.duplicarSoma(5,10);
        System.out.println(resultado);

        //Exercício 2:
        double precoComDesconto = Desconto.calcular(1000.00);
        System.out.println(precoComDesconto);

        //Exercicio 3:
        // João
        Pedido pedido1 = new Pedido(new ClienteReal("João"));
        System.out.println(pedido1.getNomeCliente());

        // Cliente não cadastrado
        Pedido pedido2 = new Pedido(null);
        System.out.println(pedido2.getNomeCliente());

        //Exercício 4:
        Produto original = new Produto("Teclado", 150);
        Ajuste ajuste = new Ajuste();

        Produto comDesconto = ajuste.aplicarDesconto(original);

        System.out.println(original.getPreco());     // 150 (inalterado)
        System.out.println(comDesconto.getPreco());  // 140 (desconto aplicado)

        //Exercício 5:
        String clienteClassificado = ClienteClassificador.classificarCliente(65,7000,50);
        System.out.println(clienteClassificado);

        //Exercício 6:


    }
}