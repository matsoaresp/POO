package Entidades;


public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public double ValorTotalEstoque(){
        return preco*quantidade;
    }
    public void AdicionarProduto (int quantidade){
        this.quantidade += quantidade;
    }
    public void RemoverProduto (int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString () {
        return "Dados do produto: "+nome+"," +
                " R$"+preco+", "+quantidade+" unidades," +
                " Total: R$"+ValorTotalEstoque();
    }
}