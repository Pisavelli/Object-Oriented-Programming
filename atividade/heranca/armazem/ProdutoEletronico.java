package atividade.heranca.armazem;

public class ProdutoEletronico extends Item {
    private int voltagem;

    public ProdutoEletronico(String codigo, double peso, int voltagem) {
        super(codigo, peso);
        this.voltagem = voltagem;
    }

    @Override
    public void exibir() {
        super.exibir(); // mostra código e peso que estão no item
        System.out.println(" | Voltagem: " + voltagem + "V");
    }
}
