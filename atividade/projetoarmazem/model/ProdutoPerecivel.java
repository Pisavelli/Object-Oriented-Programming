package atividade.projetoarmazem.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto {
    private LocalDate dataValidade;
    private double temperaturaMaxima;

    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataValidade, double temperaturaMaxima) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public void setDataValidade(LocalDate dataValidade) { this.dataValidade = dataValidade; }
    public LocalDate getDataValidade() { return dataValidade; }

    public void setTemperaturaMaxima(double temperaturaMaxima) { this.temperaturaMaxima = temperaturaMaxima; }
    public double getTemperaturaMaxima() { return temperaturaMaxima; }

    @Override
    public exibirDetalhes() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return super.exibirDetalhes() +
            String.format(" | Tipo: Perecível | Data de Validade: %s | Temperatura Máxima: %1.f°C", dataValidade.format(fmt), temperaturaMaxima);
    }
}
