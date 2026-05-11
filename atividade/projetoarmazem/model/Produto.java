package atividade.projetoarmazem.model;

public class Produto implements Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setPreco(double preco) { this.preco = preco; }
    public double getPreco() { return preco; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public int getQuantidade() { return quantidade; }

    public double calcularValorEmEstoque() {
        return preco * quantidade;
    }

    @Override
    public String exibirDetalhes() {
        return String.format("Produto: %s | Preço: %.2f | Qtd: %d", nome, preco, quantidade);
    }
}
