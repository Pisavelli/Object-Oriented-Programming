package atividade.projetoarmazem.model;

public class ProdutoEletronico extends Produto {
    private int voltagem;
    private int garantiaMeses;

    public ProdutoEletronico(String nome, double preco, int quantidade, int voltagem, int garantiaMeses) {
        super(nome, preco, quantidade);
        this.voltagem = voltagem;
        this.garantiaMeses = garantiaMeses;
    }

    public void setVoltagem(int voltagem) { this.voltagem = voltagem; }
    public int getVoltagem() { return voltagem; }

    public void setGarantiaMeses(int garantiaMeses) { this.garantiaMeses = garantiaMeses; }
    public int getGarantiaMeses() { return garantiaMeses; }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() +
            String.format(" | Tipo: Eletrônico | %dV | Garantia: %d meses", voltagem, garantiaMeses);
    }
}
