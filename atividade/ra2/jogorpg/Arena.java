package atividade.ra2.jogorpg;

public class Arena {
    public static void main(String[] args) {
        PersonagemBase guerreiro = new GuerreiroDeEspada("Pierre", 150);
        PersonagemBase mago = new Mago("Robeny", 100);

        System.out.println("=== STATUS INICIAL ===");
        guerreiro.mostrarStatus();
        mago.mostrarStatus();

        System.out.println("\n=== RODADA 1 ===");
        guerreiro.atacar(mago);
        mago.atacar(guerreiro);

        System.out.println("\n=== RODADA 2 ===");
        ((CouracaGolpeEspecial) guerreiro).atacarGolpeEspecial(mago);
        ((CouracaGolpeEspecial) mago).atacarGolpeEspecial(guerreiro);
        
        System.out.println("\n=== RODADA 3 ===");
        ((CouracaGolpeEspecial) guerreiro).atacarGolpeEspecial(mago);
        ((CouracaGolpeEspecial) mago).atacarGolpeEspecial(guerreiro);

                System.out.println("\n=== RODADA 4 ===");
        ((CouracaGolpeEspecial) guerreiro).atacarGolpeEspecial(mago);
        mago.atacar(guerreiro);

    }
}
