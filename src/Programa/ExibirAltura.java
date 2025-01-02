package Programa;
import Entidades.Altura;
import java.util.Scanner;

public class ExibirAltura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Altura altura = new Altura();
        altura.pedirDados();
        int n = sc.nextInt();
        String [] nome = new String[n];
        int [] idade = new int[n];
        double[] alt = new double[n];
        double mediaIdade = 0;
        double mediaAltura = 0;
        double totalAlturas = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da "+(i + 1)+ "a pessoa");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            alt[i] = sc.nextDouble();
            mediaIdade = (alt[i] * i) / alt[i];
            totalAlturas += alt[i] ;
            mediaAltura = totalAlturas / n;
        }

        System.out.printf("Altura média: %.2f%n",mediaAltura);
        System.out.println("Pessoas menores de 16 anos: "+mediaIdade+"%");
        for (int i = 0; i < n; i++) {



            if (idade[i] < 16){
                System.out.print(nome[i] +"\n");
            }
        }


        sc.close();
    }
}
