package atividade.projetoarmazem.model;

public class ProdutoInflamavel extends Produto {
    private double pontoFulgor;
    private String nivelRisco;

    public ProdutoInflamavel(String nome, double preco, int quantidade, double pontoFulgor, String nivelRisco) {
        super(nome, preco, quantidade);
        this.pontoFulgor = pontoFulgor;
        this.nivelRisco = nivelRisco;
    }

    public void setPontoFulgor(double pontoFulgor) { this.pontoFulgor = pontoFulgor; }
    public double getPontoFulgor() { return pontoFulgor; }

    public void setNivelRisco(String nivelRisco) { this.nivelRisco = nivelRisco; }
    public String getNivelRisco() { return nivelRisco; }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() +
            String.format(" | Tipo: Inflamável | Fulgor: %.1f°C | Risco: %s", pontoFulgor, nivelRisco);
    }
}
