package atividade.projetoarmazem.presenter;

import java.time.LocalDate;
import atividade.projetoarmazem.model.*;
import atividade.projetoarmazem.view.EstoqueView;

public class EstoquePresenter {
    private final Estoque estoque;
    private final EstoqueView view;

    public EstoquePresenter(Estoque estoque, EstoqueView view) {
        this.estoque = estoque;
        this.view = view;
    }

    public void carregarDadosIniciais() {
        estoque.adicionarProduto(new ProdutoEletronico("Notebook", 3500.00, 5, 220, 24));
        estoque.adicionarProduto(new ProdutoInflamavel("Álcool 70$", 12.50, 40, 16.0, "Alto"));
        estoque.adicionarProduto(new ProdutoPerecivel("Leite", 6.90, 30, LocalDate.of(2026, 6, 15), 8.0));
        view.mostrarMensagem("Produtos carregados com sucesso.");
    }

    public void exibirRelatorio() {
        view.mostrarProdutos(estoque.listarProdutos());
        view.mostrarValorTotal(estoque.valorTotal());
    }
}
