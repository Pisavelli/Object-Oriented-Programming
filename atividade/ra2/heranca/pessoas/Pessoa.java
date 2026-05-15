package atividade.ra2.heranca.pessoas;

public class Pessoa {
    protected String nome;
    protected String endereco;

    public void mostrarDados() {
        System.out.println(this.nome + " - Endreçi: " + this.endereco);
    }

    public String getNome() { return nome; }

    public String getEndereco() { return endereco; }

    public void setNome(String nome) { this.nome = nome; }

    public void setEndereco(String endereco) { this.endereco = endereco; }
}
