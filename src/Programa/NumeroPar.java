package Programa;

import java.util.Locale;
import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números você vai digitar");
        int n = sc.nextInt();
        int[] par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = sc.nextInt();

        }
        System.out.print("NUMEROS PARES: ");
        for (int i = 0; i < n; i++) {

            if(par[i] % 2 == 0) {
                System.out.print(par[i] + " \n");

            }
        }
        int quantidadePar = 0;
        System.out.print("QUANTIDADE DE PARES = ");
        for (int i = 0; i < n; i++) {
            if(par[i] % 2 == 0) {
                quantidadePar++;
            }
        }
        System.out.println(quantidadePar);

        sc.close();
    }
}
