package Programa;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Quantos elementos vai ter o vetor");
        int n = sc.nextInt();
        double [] vetor = new double[n];
        double somar= 0;
        double media = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Informe um número");
            vetor[i] = sc.nextDouble();

        }
        int quantidadePar = 0;
        for (int i = 0; i < n; i++) {
            media = vetor[i] / n;
            if (vetor[i] % 2 == 0) {
                somar = vetor[0] + somar;
                quantidadePar++;
            }
        }

        System.out.println("MEDIA DOS PARES");
        System.out.println(media);

        if (quantidadePar == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }





        sc.close();
    }
}
