package atividade.ra1.encapsulamento.controlepedidos;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 3500.00);
        Produto mouse = new Produto("Mouse", 150.00);

        Cliente cliente0 = new Cliente("Carlos", "carlos@gmail.com");
        Cliente cliente1 = new Cliente("Roboerto Juner", "roboerto@mail.com");

        Pedido pedido0 = new Pedido(cliente1, notebook, 2);
        Pedido pedido1 = new Pedido(cliente0, mouse, 1);

        pedido0.exibirResumo();
        pedido1.exibirResumo();
    }
}
