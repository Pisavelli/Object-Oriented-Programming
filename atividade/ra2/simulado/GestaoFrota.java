package atividade.ra2.simulado;

import java.util.ArrayList;

public class GestaoFrota {
    public static void listar(ArrayList<VeiculoAereo> veiculos) {
        for (VeiculoAereo v : veiculos) {
            System.out.print("Veículo: ");
            v.prepararMotores();
            System.out.println("Realizando entrega: ");
            v.realizarEntrega();
        }
    }

    public static void main(String[] args) {
        ArrayList<VeiculoAereo> veiculos = new ArrayList<>();

        veiculos.add(new DroneCarga());
        veiculos.add(new DroneCarga());

        listar(veiculos);
    }
}
