package atividade.ra1.inicio.contabancaria;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        saldo = 0.0;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void mostrarSaldo(double valor) {;
    }
}
