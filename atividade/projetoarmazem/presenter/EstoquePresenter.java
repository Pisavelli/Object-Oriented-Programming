package atividade.projetoarmazem.presenter;

import atividade.projetoarmazem.model.*;
import atividade.projetoarmazem.view.EstoqueView;

public class EstoquePresenter {
    private final Estoque estoque;
    private final EstoqueView view;

    public class EstoquePresenter(Estoque estoque, EstoqueView view) {
        this.estoque = estoque;
        this.view = view;
    }

    public void carregarDadosIniciais() {
        estoque.adicionarProdutos(new ProdutoEletronico("Notebook", 3500.00, 5, 220, 24));
        estoque.adicionarProdutos(new ProdutoInflamavel("Álcool 70$", 12.50, 40, 16.0, "Alto"));
        estoque.adicionarProdutos(new ProdutoPerecivel("Leite", 6.90, 30, LocalDate.of(2026.04.24), 8.0));
        view.mostrarMensagem("Produtos carregados com sucesso.");
    }

    public void exibirRelatorio() {
        view.mostrarProdutos(estoque.listarProdutos());
        view.mostrarValorTotal(estoque.valorTotal());
    }
}
