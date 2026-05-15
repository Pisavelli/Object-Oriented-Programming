package atividade.ra2.interfaces.exemplo3;

public class Teste1 {
    public static void main(String[] args) {
        Relatorio1 r = new MeuRelatorio1();
        OutroRelatorio outro = new OutroRelatorio();

        r.imprimirCabecalho();
        r.imprimirConteudo();
        r.imprimirRodape();
        System.out.println("====================================");
        outro.imprimirCabecalho();
        outro.imprimirConteudo();
        outro.imprimirRodape();
    }
}
