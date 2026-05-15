package atividade.ra1.encapsulamento.cadastroalunos;

public class TesteCadastroAlunos {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlos Chagas", 54378);
        Aluno aluno = new Aluno("Roberto Júnior", 7684);

        Disciplina disciplina = new Disciplina("Programação ORientada a Objetos", professor, aluno);

        disciplina.exibirInformacao();

        professor.setNome("Carlos Júnior");

        disciplina.exibirInformacao();

        disciplina.setAluno(new Aluno("novo aluno", 54367));

        aluno.setMatricula(547654);
    }
}
