package atividade.ra2.heranca.exercicio1;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String numCel, String cpf) {
        super(nome, endereco, numCel);
        this.cpf = cpf;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CPF: " + cpf);
    }
}
