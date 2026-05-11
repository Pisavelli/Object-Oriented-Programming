package atividade.heranca.exercicio1;

public class Pessoa {
    private String nome;
    private String endereco;
    private String numCel;

    public Pessoa(String nome, String endereco, String numCel) {
        this.nome = nome;
        this.endereco = endereco;
        this.numCel = numCel;
    }

    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO ALUNO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Contato: " + numCel);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumCel(String numCel) {
        this.numCel = numCel;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumCel() {
        return numCel;
    }
}
