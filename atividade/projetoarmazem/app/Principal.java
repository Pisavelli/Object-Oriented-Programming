package atividade.projetoarmazem.app;

import atividade.projetoarmazem.model.Estoque;
import atividade.projetoarmazem.presenter.EstoquePresenter;
import atividade.projetoarmazem.view.ConsoleEstoqueView;

public class Principal {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        ConsoleEstoqueView view = new ConsoleEstoqueView();
        EstoquePresenter presenter = new EstoquePresenter(estoque, view);

        presenter.carregarDadosIniciais();
        presenter.exibirRelatorio();
    }
}
