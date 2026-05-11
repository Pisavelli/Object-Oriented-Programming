package atividade.heranca.pessoas;

public class Principal extends Pessoa {
    public static void main(String [] args) {
        Aluno a;
        a = new Aluno();
        a.setNome("Calors Eduard");
        a.setEndereco("Rua Japacaragas");
        a.setMatricula("0695-MF-13");
        a.mostrarDados();

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "abimael";
    }
}
