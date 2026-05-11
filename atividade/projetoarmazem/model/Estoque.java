package atividade.projetoarmazem.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private final List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos);
    }

    public double valorTotal() {
        double total = 0.0;
        for (Produto p : produtos) {
            total += p.calcularValorEmEstoque();
        }
        return total;
    }
}
