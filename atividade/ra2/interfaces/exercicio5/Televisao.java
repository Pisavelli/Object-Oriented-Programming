package atividade.ra2.interfaces.exercicio5;

public class Televisao extends Especificacao {
    public Televisao(String modelo) {
        super(modelo);
    }

    @Override
    public void ligar() {
        System.out.println("TV ligada.");    
    }

    @Override
    public void desligar() {
        System.out.println("TV desligada.");
    }

    @Override
    public void exibirDados() {
        System.out.println("Modelo da TV: " + modelo);
    }
}
