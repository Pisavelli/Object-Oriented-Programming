package atividade.ra2.jogorpg;

public class Mago extends PersonagemBase implements CouracaGolpeEspecial {
    public Mago(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(PersonagemBase inimigo) {
        System.out.println(nome + " aplicou Abracadabra!");
        inimigo.sofrerDano(5);
    }

    @Override
    public void atacarGolpeEspecial(PersonagemBase inimigo) {
        System.out.println(nome + " aplicou Feitiço de Merlin!");
        inimigo.sofrerDano(50);
    }
}
