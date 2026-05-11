package atividade.heranca.exemplo3;

public class BaseProduto {
    private String nome;

    public BaseProduto(String nomeY) {
        this.nome = nomeY;
        System.out.println("Construtor de BaseProduto");
    }

    @Override
    public String toString() {
        return "nome = " + "\"" + nome + "\"";
    }
}
