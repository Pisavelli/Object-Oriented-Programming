package atividade.classeabstrata.exercicio4;

public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;
    public Horista(String nome, double horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }
    public double getHorasTrabalhadas() { return horasTrabalhadas; }

    public void setValorHora(double valorHora) { this.valorHora = valorHora; }
    public double getValorHora() { return valorHora; }

    @Override
    public double calcularPagamento() {
        double pagamento = horasTrabalhadas * valorHora;
        System.out.println("Pagamento Horista: " + pagamento);
        return pagamento;
    }
}
