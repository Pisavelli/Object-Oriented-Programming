package atividade.ra2.interfaces.exercicio5;

public class Computador extends Especificacao {
    public Computador(String modelo) {
        super(modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Computador ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado.");
    }

    @Override
    public void exibirDados() {
        System.out.println("Modelo do Computador: " + modelo);
    }
}
