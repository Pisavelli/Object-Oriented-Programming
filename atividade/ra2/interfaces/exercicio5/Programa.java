package atividade.ra2.interfaces.exercicio5;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Especificacao> dispositivos = new ArrayList<>();

        dispositivos.add(new Televisao("LG Smart TV"));
        dispositivos.add(new Computador("Samsung Notebook"));
        dispositivos.add(new Televisao("Samsung QLED"));
        dispositivos.add(new Computador("ASUS VivoBook"));

        for (Especificacao e : dispositivos) {
            e.exibirDados();

            if (e instanceof Televisao) {
                ((Televisao) e).ligar();
                ((Televisao) e).desligar();
            } else if (e instanceof Computador) {
                ((Computador) e).ligar();
                ((Computador) e).desligar();
            }
            System.out.println("----------");
        }
    }
}
