package atividade.ra2.instanceofecasting.exemplo1;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ArrayList<MeioDeTransporte> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Civic"));
        veiculos.add(new Bicicleta("Caloi Elite", true));
        veiculos.add(new Carro("Corolla"));

        for (MeioDeTransporte t : veiculos) {
            t.exibirModelo();

            //verifica o tipo real do objeto
            if (t instanceof Carro) {
                Carro c = (Carro) t; //casting
                c.acelerar();
                ((Carro) t).acelerar(); //casting direto
            } else if (t instanceof Bicicleta) {
                Bicicleta b = (Bicicleta) t; //casting
                b.pedalar();
                ((Bicicleta) t).pedalar(); //casting direto
            }

            System.out.println("----------");
        }
    }
}
