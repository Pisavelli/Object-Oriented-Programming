package atividade.colecoes.turma;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
    private String nomeTurma;
    private int periodo;
    private ArrayList<Aluno> alunos;

    Scanner scanner = new Scanner(System.in);

    public Turma(String nomeTurma, int periodo) {
        this.nomeTurma = nomeTurma;
        this.periodo = periodo;
        this.alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void listarAlunos() {
        System.out.println("Turma: " + getNomeTurma() + " ");
        System.out.println("Período: " + getPeriodo());
        if (this.alunos.size() > 0) {
            for (Aluno aluno : this.alunos) {
                System.out.println("Nome: " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
            }
        }
    }
}
