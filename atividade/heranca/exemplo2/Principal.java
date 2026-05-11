package atividade.heranca.exemplo2;

public class Principal {
    public static void main(String[] args) {
        Object object = new Object();
        TesteNivel0 t0 = new TesteNivel0();
        TesteNivel1 t1 = new TesteNivel1();
        TesteNivel2 t2 = new TesteNivel2();
        System.out.println("Object: " + object);
        System.out.println("TesteNivel0: " +t0);
        System.out.println("TesteNivel1: " +t1);
        System.out.println("TesteNivel2: " +t2);
    }
}
