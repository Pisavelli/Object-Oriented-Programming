package atividade.heranca.pessoas;

public class Aluno extends Pessoa {
    private String matricula;

    @Override
    public void mostrarDados(){
        System.out.println("Nome: " + this.nome + "\n" + "Endereço: " + this.endereco + "\n" + "Matrícula: " + this.matricula);
    }

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) { this.matricula = matricula; }
}
