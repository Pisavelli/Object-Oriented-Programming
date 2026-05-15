package atividade.ra1.inicio.motor;

public class Motor {
    private boolean ligado;
    private int rpm;

    public Motor() {
        this.ligado = false;
        this.rpm = 0;
    }

    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            this.rpm = 1000;
        }
    }

    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            this.rpm = 0;
        }
    }

    public void acelerar(int nivel) {
        if (isLigado()) {
            rpm += (nivel * 1000);
            if (rpm >= 8000) {
                rpm = 8000;
            } else if (rpm <= 0) {
                desligar();
            }
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getRpm() {
        return rpm;
    }
}
