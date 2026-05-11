package atividade.heranca.armazemelhor;

public class Item {
    private String nome;
    private String codigo;
    private double precoBase;

    public Item(String nome, String codigo, double precoBase) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoBase = precoBase;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + "\nCódigo: " + codigo + "\nPreço Base: R$ " + precoBase);
    }

    public void setNome(String nome) { this.nome = nome; }

    public void setCodigo(String codigo) { this.codigo = codigo; }

    public void setPrecoBase(double precoBase) { this.precoBase = precoBase; }

    public String getNome() { return nome; }

    public String getCodigo() { return codigo; }

    public double getPrecoBase() { return precoBase; }
}
