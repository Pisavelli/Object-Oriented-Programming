package atividade.ra2.jogorpg;

public abstract class PersonagemBase {
    protected String nome;
    protected int vida;

    public PersonagemBase(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void mostrarStatus() {
        System.out.println("[ " + nome + " ] Vida: " + vida);
    }

    public abstract void atacar(PersonagemBase inimigo);

    public void sofrerDano(int dano) {
        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nome + " sofreu " + dano + " de dano!");
        mostrarStatus();

        if (vida == 0) {
            System.out.println(nome + " morreu!");
        }
    }
}