package atividade.ra2.interfaces.exemplo3;

public interface Relatorio1 {
    public void imprimirCabecalho();
    public void imprimirConteudo();

    public default void imprimirRodape() {
        System.out.println("Método imprimirRodapé!!");
    }
}
