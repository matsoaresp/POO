package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();
        double [] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }
        double somar = 0;
        double media = 0;
        System.out.print("MEDIA DO VETOR ");
        for (int i = 0; i < n; i++) {
            somar = vetor[0] + somar;

        }
        media = somar / n;
        System.out.printf("%.3f",media);
        System.out.println("\nELEMENTOS ABAIXO DA MÉDIA: ");
        for(int i = 0; i < n; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}
