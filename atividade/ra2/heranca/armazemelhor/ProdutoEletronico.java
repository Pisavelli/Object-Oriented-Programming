package atividade.ra2.heranca.armazemelhor;

public class ProdutoEletronico extends Item {
    private int garantia;

    public ProdutoEletronico(String nome, String codigo, double precoBase, int garantia) {
        super(nome, codigo, precoBase);
        this.garantia = garantia;
    }

    @Override
    public void exibir() {
        super.exibir(); // mostra nome, codigo, precoBase que estão na classe Item
        System.out.println("\nGarantia: " + garantia);
    }
}
