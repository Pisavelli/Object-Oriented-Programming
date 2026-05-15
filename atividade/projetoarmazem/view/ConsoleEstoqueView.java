package atividade.projetoarmazem.view;

import atividade.projetoarmazem.model.Produto;
import java.util.List;

public class ConsoleEstoqueView implements EstoqueView {
    @Override
    public void mostrarProdutos(List<Produto> produtos) {
        System.out.println("=== Produtos no Estoque ===");
        for (Produto p : produtos) {
            System.out.println(p.exibirDetalhes());
        }
    }

    @Override
    public void mostrarValorTotal(double valorTotal) {
        System.out.printf("Valor total em estoque: R$ %.2f$n", valorTotal);
    }

    @Override
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
