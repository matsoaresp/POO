package Programa;
import Entidades.Banco;


import java.util.Locale;
import java.util.Scanner;

public class RelatorioBanco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Banco banco;
        System.out.println("Informe o número da conta");
        int conta = sc.nextInt();
        System.out.println("Informe o titular da conta");
        String nome = sc.next();

        System.out.println("Esse é o seu depósito inicial (y/n)");
        String opcao = sc.next();
        if (opcao.equals("y")) {
            System.out.println("Deposite seu valor inicial: ");
            double valor = sc.nextDouble();
             banco = new Banco(conta,nome,valor);
        } else {
             banco = new Banco(conta,nome);
        }
        System.out.println("Dados da conta: ");
        System.out.println(banco);
        System.out.println("Deposite um valor");
        banco.AdicionaDeposito(sc.nextDouble());
        System.out.println("Atualização da conta: ");
        System.out.println(banco);
        System.out.println("Saque um valor");
        banco.SubtraiDeposito(sc.nextDouble());
        System.out.println("Atualização da conta:");
        System.out.println(banco);
        System.out.println("Altere seu nome");
        String novoNome = sc.next();
        banco.setNome(novoNome);
        System.out.println(banco);
    }
}
