package atividade.ra2.interfaces.exemplo3;

public class OutroRelatorio implements Relatorio1 {
    @Override
    public void imprimirCabecalho() {
        System.out.println("Método imprimirCabeçalho de OutroRelatório");
    }

    @Override
    public void imprimirConteudo() {
        System.out.println("Método imprimirConteúdo de OutroRelatório");
    }

    @Override
    public void imprimirRodape() {
        System.out.println("Método imprimirRodape de OutroRelatório");
    }
}
