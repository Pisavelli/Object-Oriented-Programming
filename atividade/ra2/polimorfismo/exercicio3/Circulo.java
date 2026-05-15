package atividade.ra2.polimorfismo.exercicio3;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) { this.raio = raio; }
    public double getRaio() { return raio; }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
