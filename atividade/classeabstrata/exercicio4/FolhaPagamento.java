package atividade.classeabstrata.exercicio4;

import java.util.ArrayList;

public class FolhaPagamento {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Assalariado("Pierre", 1100));
        funcionarios.add(new Horista("Robency", 8, 50));
        }
    }
