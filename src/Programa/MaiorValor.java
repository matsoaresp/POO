package Programa;

import java.util.Locale;
import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números você vai digitar");
        int numero = sc.nextInt();
        double[] vetor = new double[numero];
        for (int i = 0; i < numero; i++) {
            vetor[i] = sc.nextInt();
        }
        double maior = vetor[0];
        System.out.println("MAIOR VALOR");
        for (int i = 0; i < numero; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println(maior);
        sc.close();
    }
}
