package atividade.encapsulamento.controlepedidos;

public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void exibirResumo() {
        double total = produto.getPreco() * quantidade;

        System.out.println("=== Resumo do Pedido ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total (R$): " + total);
        System.out.println("====================");
    }
}
