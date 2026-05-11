package atividade.projetoarmazem.view;

import atividade.projetoarmazem.model.Produto;
import java.util.List;

public interface EstoqueView {
    void mostrarProdutos(List<Produto> produtos);
    void mostrarValorTotal(double valorTotal);
    void mostrarMensagem(String mensagem);
}