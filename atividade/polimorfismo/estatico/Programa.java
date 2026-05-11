package atividade.polimorfismo.estatico;

public class Programa {
    public static void main(String[] args) {
        CalculadoraInt calc = new CalculadoraInt();
        int resultado;
        resultado = calc.somar(5, 3);
        System.out.println("Soma de 5 e 3 = " + resultado);
        resultado = calc.somar(5, 3, 2);
        System.out.println("Soma de 5, 3 e 2 = " + resultado);
    }
}
