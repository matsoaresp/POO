package Programa;

import Entidades.Pagamento;
import java.util.Locale;
import java.util.Scanner;

public class RelatorioPagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pagamento pagamento = new Pagamento();

        while (true) {
            try {
                System.out.println("Informe seu nome:");
                pagamento.setNome(sc.nextLine());

                System.out.println("Informe seu salário:");
                pagamento.setSalario(sc.nextDouble());
                sc.nextLine();

                pagamento.calcularSalarioLiquido();

                System.out.println("Deseja continuar? (Digite '1' para sair ou qualquer outra tecla para continuar)");
                String opcao = sc.nextLine();

                if (opcao.equals("1")) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("\nRELATÓRIO DA FOLHA DE PAGAMENTO:");
        for (String registro : pagamento.getRelatorio()) {
            System.out.println(registro);
        }

        sc.close();
    }
}
