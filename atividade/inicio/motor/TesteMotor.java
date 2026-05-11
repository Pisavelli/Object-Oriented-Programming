package atividade.inicio.motor;

public class TesteMotor {
    public static void main(String[] args) {
        int quantidadeDeAceleracao = 0;
        Motor motor = new Motor();
        System.out.println("Status do motor " + motor.isLigado());
    }
}
