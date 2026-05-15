package atividade.ra2.instanceofecasting.exemplo1;

public class Carro extends MeioDeTransporte {
    public Carro(String modelo) {
        super(modelo);
    }

    public void acelerar() {
        System.out.println("Acelerando o carro");
    }
}
