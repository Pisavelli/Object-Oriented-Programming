package atividade.polimorfismo.exercicio3;

import java.util.ArrayList;

public class Programa {
    public static void listar(ArrayList<Forma> formas) {
        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Retangulo(5, 4));
        formas.add(new Circulo(20));

        listar(formas);
    }
}
