package atividade.ra2.simulado;

public abstract class VeiculoAereo {
    public abstract void realizarEntrega();

    public void prepararMotores() {
        System.out.println("Sistemas verificados. Motores prontos para decolagem.");
    }
}
