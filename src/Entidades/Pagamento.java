package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Pagamento {
    public String nome;
    public double salario;
    public double recolhimento;
    public double imposto;
    public double salarioLiq;
    public List<String> relatorio;


    public Pagamento() {
        this.relatorio = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() < 2 || nome.length() > 30) {
            throw new IllegalArgumentException("O nome deve conter entre 2 e 30 caracteres.");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 465.00) {
            throw new IllegalArgumentException("O salário não pode ser menor que 465.00.");
        }
        this.salario = salario;
    }

    public double getSalarioLiquido() {
        return salarioLiq;
    }


    public void calcularRecolhimento() {
        if (salario < 965.67) {
            recolhimento = salario * 0.08;
        } else if (salario < 1609.45) {
            recolhimento = salario * 0.09;
        } else if (salario < 3218.90) {
            recolhimento = salario * 0.11;
        } else {
            recolhimento = 0;
        }
    }

    public void calcularImposto() {
        if (salario < 1434.00) {
            imposto = 0.0;
        } else if (salario < 2150.00) {
            imposto = salario * 0.0075;
        } else if (salario < 2886.00) {
            imposto = salario * 0.15;
        } else if (salario < 3582.00) {
            imposto = salario * 0.225;
        } else {
            imposto = salario * 0.275;
        }
    }

    public void calcularSalarioLiquido() {
        calcularRecolhimento();
        calcularImposto();
        salarioLiq = salario - (recolhimento + imposto);

        relatorio.add(
                "Nome: " + nome +
                        " - Salário Bruto: R$ " + salario +
                        " - Recolhimento: R$ " + recolhimento +
                        " - Imposto: R$ " + imposto +
                        " - Salário Líquido: R$ " + salarioLiq
        );
    }

    public List<String> getRelatorio() {
        return relatorio;
    }
}
