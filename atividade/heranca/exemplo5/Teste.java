package atividade.heranca.exemplo5;

public class Teste {
    public static void main(String[] args) {
        Classe2 c2 =  new Classe2();
        c2.calcular();
        c2.setValor(1000);
        c2.setPercentual(0.80);
        c2.setPercentualImposto(0.30);
        c2.mostrar();
    }
}
