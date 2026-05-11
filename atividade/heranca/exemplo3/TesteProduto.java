package atividade.heranca.exemplo3;

public class TesteProduto {
    public static void main(String [] args) {
        System.out.println("Este é um exemplo para testar o " + "construtor ancestral com super()");
        ProdutoSimples ps = new ProdutoSimples("Xícara", "0123456789");
        System.out.print("Produto:\n");
        System.out.println(ps);
    }
}
