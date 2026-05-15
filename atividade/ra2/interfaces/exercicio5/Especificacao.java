package atividade.ra2.interfaces.exercicio5;

public abstract class Especificacao implements Dispositivo {
    protected String modelo;

    public Especificacao(String modelo) {
        this.modelo = modelo;
    }

    public abstract void exibirDados();
}
