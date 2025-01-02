package Programa;

import java.util.Locale;
import java.util.Scanner;

public class NumNegativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos nuúmeros você vai digitar");
        int n = sc.nextInt();
        int[] vetor  = new int[n];

        for(int i = 0; i < n; i++){

            System.out.println("Digite um número");
            vetor[i] = sc.nextInt();

        }

        System.out.println("NUMEROS NEGATIVOS");
        for(int i = 0; i < n; i++){
            if(vetor[i] < 0){
                System.out.printf("%d\n", vetor[i]);
            }
        }
        System.out.println();
        sc.close();
    }
}
