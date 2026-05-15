package atividade.ra1.colecoes.pedido;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente0 = new Cliente("Pierre", "pierre@gmail.com");
        Produto macarrao = new Produto("Macarrão", 15);
        Produto arroz = new Produto("Arroz", 10);
        Produto feijao = new Produto("Feijão", 8);
        Produto alcatra = new Produto("Alcatra", 50);
        Produto batataPalha = new Produto("Batata Palha", 15);

        Pedido pedido0 = new Pedido(cliente0, macarrao, 2);
        pedido0.exibirResumo();
    }
}
