package Entidades;

public class Banco {
    private int conta;
    public String nome;
    public double deposito;



    public int getConta() {

        return conta;
    }

    public String getNome() {
        return nome;
    }

    public double getDeposito() {
        return deposito;
    }

    public Banco(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;

    }
    public Banco(int conta, String nome, double deposito) {
        this.conta = conta;
        this.nome = nome;
        this.deposito = deposito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double AdicionaDeposito(double valor) {
        this.deposito += valor;
        return this.deposito;
    }

    public double SubtraiDeposito(double valor) {
        this.deposito -= valor + 5.0;
        return this.deposito;
    }

    public String toString (){
        return "Conta "+conta+" Nome: "+nome+" Deposito: $ "+deposito;
    }
}
