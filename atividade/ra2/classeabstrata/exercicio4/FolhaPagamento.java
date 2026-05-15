package atividade.ra2.classeabstrata.exercicio4;

import java.util.ArrayList;

public class FolhaPagamento {
    public static void listar(ArrayList<Funcionario> lista) {
        for (Funcionario funcionario : lista) {
            System.out.println(funcionario.getNome() + " - Salário: " + funcionario.calcularPagamento());
        }
    }

    public static void main(String[] args) {
        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(new Assalariado("Pierre", 1100));
        lista.add(new Horista("Robency", 8, 50));
        listar(lista);
    }
}