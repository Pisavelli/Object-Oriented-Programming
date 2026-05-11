package atividade.heranca.armazem;

public class Principal {
    public static void main(String[] args) {
        ProdutoPerecivel p1 = new ProdutoPerecivel("PER-001", 2.5, "2026-05-10");
        ProdutoEletronico e1 = new ProdutoEletronico("ELE-505", 15.0, 220);

        System.out.println("--- Relatório de Entrada no Armazém ---");
        p1.exibir();
        e1.exibir();
    }
}
