package org.example.exercicio5;

public class ClienteClassificador {
    public static String classificarCliente(int idade, double renda, int compras) {
        if (idade > 60) {
            return classificarSenior(renda, compras);
        }
        return classificarJovem(renda, compras);
    }

    private static String classificarSenior(double renda, int compras) {
        if (renda <= 5000) {
            return "Cliente Sênior Baixa Renda";
        }
        if (compras > 10) {
            return "Cliente Premium Sênior";
        }
        return "Cliente Regular Sênior";
    }

    private static String classificarJovem(double renda, int compras) {
        if (renda <= 7000) {
            return "Cliente Jovem Baixa Renda";
        }
        if (compras > 20) {
            return "Cliente Premium Jovem";
        }
        return "Cliente Regular Jovem";
    }
}