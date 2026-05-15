package atividade.ra1.colecoes.pedido;

import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.quantidade = quantidade;
        this.produtos = new ArrayList<Produto>();
    }

    public void exibirResumo() {
        double total = produto.getPreco() * quantidade;

        System.out.println("=== RESUMO DO PEDIDO ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total (R$): " + total);
        System.out.println("===============================");
    }
}
