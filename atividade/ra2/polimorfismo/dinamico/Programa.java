package atividade.ra2.polimorfismo.dinamico;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Pet> petsNaLista = new ArrayList<>();
        petsNaLista.add(new Cachorro());
        petsNaLista.add(new Gato());
        petsNaLista.add(new Robency());
        petsNaLista.add(new Arara());
        petsNaLista.add(new BrasileiroBurroMedio());

        for (Pet pet : petsNaLista) {
            pet.fazerSom();
        }
    }
}
