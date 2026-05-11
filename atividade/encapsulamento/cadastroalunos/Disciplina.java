package atividade.encapsulamento.cadastroalunos;

public class Disciplina {
    private String nome;
    private Professor professor; // <- objeto dentro de objeto
    private Aluno aluno; // <- objeto dentro de objeto

    public Disciplina(String nome, Professor professor, Aluno aluno) {
        this.nome = nome;
        this.professor = professor;
        this.aluno = aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void exibirInformacao() {
        System.out.println("=== Disciplina " + nome + " ===");
        System.out.println("Professor: " + professor.getNome());
        System.out.println("ID: " + professor.getId());
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}