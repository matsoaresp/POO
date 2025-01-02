package Programa;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double soma = 0;
        double media = 0;
        System.out.println("Quantos números você vai digitar");
        int n = sc.nextInt();
        double[] vet = new double[n];
        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextInt();
             soma += vet[i];
             media = soma / n;
            }

        System.out.print("Valores = ");
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.printf("\nSOMA %.2f%n",soma);
        System.out.printf("\nMÉDIA %.2f%n",media);

    }
}
