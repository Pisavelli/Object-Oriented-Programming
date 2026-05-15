package atividade.ra2.classeabstrata.exercicio4;

public class Assalariado extends Funcionario {
    private double salarioMensal;

    public Assalariado(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) { this.salarioMensal = salarioMensal; }
    public double getSalarioMensal() { return salarioMensal; }

    @Override
    public double calcularPagamento() {
        System.out.println("Salário Mensal: " + salarioMensal);
        return salarioMensal;
    }
}
