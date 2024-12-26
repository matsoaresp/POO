package Entidades;


public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
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