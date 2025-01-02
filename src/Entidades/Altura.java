package Entidades;

public class Altura {
    public String nome;
    public int idade;
    public double altura;

    public Altura () {

    }
    public Altura(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter e Setter para altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void pedirDados (){
        System.out.println("Quantas pessoas serão digitadas ");
    }
}
