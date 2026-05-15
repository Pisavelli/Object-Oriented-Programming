package atividade.ra2.heranca.exemplo3;

public class ProdutoSimples extends BaseProduto {
    private String codigo;

    public ProdutoSimples(String nome, String codigo) {
        super(nome);
        this.codigo = codigo;
        System.out.println("Construtor de ProdutoSimples");
    }

    @Override
    public String toString() {
        String s = super.toString();

        return s + " codigo = \"" + codigo + "\"";
    }
}
