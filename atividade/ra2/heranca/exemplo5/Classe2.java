package atividade.ra2.heranca.exemplo5;

public class Classe2 extends Classe1 {
    double valorImposto;
    double percentualImposto;
    
    public Classe2() {
        this.valorImposto = 0.0;
    }

    public double getPercentualImposto() {
        return percentualImposto;
    }

    public void setPercentualImposto(double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }

    public void calcular() {
        super.calcular();
        valorImposto = getValorPercentual() * percentualImposto;
    }

    @Override
    public void mostrar() {
        this.calcular();
        super.mostrar();
        System.out.print("Mostrar na classe Classe2");
        System.out.print("Valor imposto: " + this.valorImposto);
    }

    public double getValorimposto() {
        return valorImposto;
    }
}
