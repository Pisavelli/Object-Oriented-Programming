package atividade.ra2.interfaces.exemplo3;

public class MeuRelatorio1 implements Relatorio1 {
    @Override
    public void imprimirCabecalho() {
        System.out.println("Método imprimirCabeçalho");
    }

    @Override
    public void imprimirConteudo() {
        System.out.println("Método imprimirConteúdo");
    }
}
