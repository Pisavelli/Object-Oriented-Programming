package atividade.colecoes.turma;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Pierre", 54363);
        Aluno aluno1 = new Aluno("Matheus", 54765);
        Aluno aluno2 = new Aluno("Robency", 54321);
        Aluno aluno3 = new Aluno("Carlos", 2134);
        Aluno aluno4 = new Aluno("Roberto Júnior", 2984);

        Aluno aluno0 = new Aluno("Piee", 54363);
        Aluno aluno9 = new Aluno("Maheus", 54765);
        Aluno aluno8 = new Aluno("Roency", 54321);
        Aluno aluno7 = new Aluno("Caros", 2134);
        Aluno aluno6 = new Aluno("Robeo Júior", 5984);

        Turma turma1 = new Turma("Turma do Pierre", 3);
        turma1.adicionarAluno(aluno);
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);
        turma1.adicionarAluno(aluno4);
        turma1.listarAlunos();

        Turma turma2 = new Turma("Turma dos Menos", 1);
        turma2.adicionarAluno(aluno0);
        turma2.adicionarAluno(aluno9);
        turma2.adicionarAluno(aluno8);
        turma2.adicionarAluno(aluno7);
        turma2.adicionarAluno(aluno6);
        turma2.listarAlunos();
    }
}
