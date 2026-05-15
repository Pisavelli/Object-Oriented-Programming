package atividade.ra2.interfaces.exemplo2;

public class MeuRelatorio implements Relatorio {
    @Override
    public void imprimirCabecalho() {
        System.out.println("Método imprimirCabeçalho");
    }

    @Override
    public void imprimirConteudo() {
        System.out.println("Método imprimirConteúdo");
    }

    public void testarMsg() {
        System.out.println("Este é o método testarMsg");
    }
}
