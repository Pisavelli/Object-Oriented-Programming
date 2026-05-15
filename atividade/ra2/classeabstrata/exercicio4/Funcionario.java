package atividade.ra2.classeabstrata.exercicio4;

public abstract class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    public abstract double calcularPagamento();

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Pagamento: " + calcularPagamento());
    }
}
