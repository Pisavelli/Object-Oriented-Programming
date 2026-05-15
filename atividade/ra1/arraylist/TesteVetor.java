package atividade.ra1.arraylist;

public class TesteVetor {
    public static void main(String[] args) {
        int numerosPares[] = new int[6];

        int numerosParesInicializado[] = {0,2,4,6,8,10};

        System.out.println("Números pares não inicializados");
        System.out.println(numerosPares[2]);
        System.out.println("Números pares inicializados");
        System.out.println(numerosParesInicializado[2]);

        System.out.println("Mostrando elementos do vetor não inicializado");
        for (int i=0; i < numerosPares.length; i++) {
            System.out.println("Elemento índice " + i + " " + numerosPares[i]);
        }

        numerosParesInicializado[5] = 12;
        System.out.println("Mostrando elementos do vetor inicializado");
        for (int i=0; i < numerosParesInicializado.length; i++) {
            System.out.println("Elemento índice " + i + " " + numerosParesInicializado[i]);
        }
    }
}
