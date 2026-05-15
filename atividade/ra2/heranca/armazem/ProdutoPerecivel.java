package atividade.ra2.heranca.armazem;

public class ProdutoPerecivel extends Item {
    private String validade;

    public ProdutoPerecivel(String codigo, double peso, String validade) {
        super(codigo, peso); // enviar código e peso para a classe Item
        this.validade = validade;
    }

    @Override // sobreescrever = vai adicionar o que coloquei com o exibir() original
    public void exibir() {
        super.exibir(); // mostra código e peso que estão no item
        System.out.println(" | Validade: " + validade);
    }
}
