package atividade.ra2.interfaces.exemplo4;

public class Carro implements Ligavel, Tanque {
    @Override
    public void ligar() {
        System.out.println("Ligar");
    }

    @Override
    public void desligar() {
        System.out.println("Desligar");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecer");
    }

    @Override
    public double getNivelCombustivel() {
        return 0;
    }
}
