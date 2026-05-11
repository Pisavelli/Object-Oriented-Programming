package atividade.heranca.exercicio1;

public class Aluno extends PessoaFisica {
    private int matricula;
    private int disciplinas;

    public Aluno(String nome, String endereco, String numCel, String cpf, int matricula, int disciplinas) {
        super(nome, endereco, numCel, cpf);
        this.matricula = matricula;
        this.disciplinas = disciplinas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Disciplinas: " + disciplinas);
    }
}
