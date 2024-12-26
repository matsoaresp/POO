package Programa;
import Entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class RelatorioProdutos {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);


    System.out.println("Informe os dados do produto: ");
    System.out.println("Nome");
    String nome = sc.nextLine();
    System.out.println("Preço");
    double preco = sc.nextDouble();

    Produto produto = new Produto(nome, preco);
    produto.setNome("Computador");
    System.out.println("Atualização do produto "+produto.getNome());
    System.out.println(produto);
    produto.setPreco(1200.00);
    System.out.println("Atualização de valor "+produto.getPreco());

    System.out.println("Informe um número para adicionar nos produtos de estoque:");

    produto.AdicionarProduto(sc.nextInt());
    System.out.println(produto);

    System.out.println("Informe um número para remover os produtos do estoque:");
    produto.RemoverProduto(sc.nextInt());
    System.out.println(produto);


    }
}
