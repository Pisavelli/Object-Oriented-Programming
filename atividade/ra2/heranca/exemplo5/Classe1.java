package atividade.ra2.heranca.exemplo5;

public class Classe1 {
    private double valor;
    private double percentual;
    private double valorPercentual;

    public Classe1() {
        valor = 0.0;
        valorPercentual = 0.0;
        percentual = 0.0;
    }

    public void calcular() {
        valorPercentual = valor * percentual;
    }

    public double getValorPercentual() {
        return valorPercentual;
    }

    public void mostrar() {
        this.calcular();
        System.out.println("Mostrar em Classe1");
        System.out.println("Valor = " + this.valor);
        System.out.println("Percentual = " + this.percentual);
        System.out.println("Valor Percentual = " + this.valorPercentual);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getValor() {
        return valor;
    }

    public double getPercentual() {
        return percentual;
    }
}
