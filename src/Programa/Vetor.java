package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe a quantidade de valores que deseja inserir");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double soma = 0;
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();

        }

        for (int i = 0; i < n; i++) {
            soma += vetor[i] ;

        }
        System.out.println(soma);

        sc.close();
    }
}
