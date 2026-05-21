package atividade.ra2.jogorpg;

public class GuerreiroDeEspada extends PersonagemBase implements CouracaGolpeEspecial {
    public GuerreiroDeEspada(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(PersonagemBase inimigo) {
        System.out.println(nome + " aplicou Ataque com Espada!");
        inimigo.sofrerDano(10);
    }

    @Override
    public void atacarGolpeEspecial(PersonagemBase inimigo) {
        System.out.println(nome + " aplicou Golpe de Thor!");
        inimigo.sofrerDano(30);
    }
}
