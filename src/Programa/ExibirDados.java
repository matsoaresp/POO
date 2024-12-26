package Programa;

import Entidades.Dados;

import java.util.Locale;
import java.util.Scanner;

public class ExibirDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double soma = 0;
        System.out.println("Quantos valores deseja inserir");
        int n = sc.nextInt();
        Dados[] dados = new Dados[n];
        for (int i = 0; i < n; i++) {

                String nomeDado = sc.nextLine();
                double preco = sc.nextDouble();
                dados[i] = new Dados(nomeDado, preco);
                soma += dados[i].getIdade();

        }
        double avg = soma / n;
        System.out.println("Resultado da soma: " + avg);
        sc.close();
    }
}
