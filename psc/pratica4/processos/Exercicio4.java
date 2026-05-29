package psc.pratica4.processos;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Exercicio4 {
    // Estrutura simples para representar um processo nomeado e seu comando
    static class Comando {
        String nome;
        String[] argumentos;

        Comando(String nome, String... argumentos) {
            this.nome = nome;
            this.argumentos = argumentos;
        }
    }

    /**
     * Executa uma lista de comandos NA ORDEM dada,
     * mede o tempo de inicializacao de cada um e imprime os resultados.
     */
    static void executarEMedir(List<Comando> ordem, int numeroExecucao) throws IOException, InterruptedException {
        System.out.println("\n--- Execução: " + numeroExecucao +
                " | Ordem: " + ordem.stream()
                .map(c -> c.nome)
                .reduce((a, b) -> a + " -> " + b)
                .orElse(""));

        // Lista para guardar os processos criados e poder aguardá-los depois
        Process[] processos = new Process[ordem.size()];

        for (int i = 0; i < ordem.size(); i++) {
            Comando cmd = ordem.get(i);

            // Marca o instante exatamente antes da chamada de criação
            long inicio = System.nanoTime();
            processos[i] = new ProcessBuilder(cmd.argumentos).start();
            long fim = System.nanoTime();

            long tempo = fim - inicio;
            System.out.printf(" Posição %d | Processo %s | Tempo = %d ns (%.3f ms)%n",
                    i + 1, cmd.nome, tempo, tempo / 1_000_000.0);
        }

        // Espera todos os filhos terminarem antes de passar a próxima execução,
        // garantindo que uma execução não interfira na seguinte
        for (Process p : processos) {
            p.waitFor();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        // Definimos 3 processos distintos que funcionam nativamente no Windows:
        Comando a = new Comando("A(ver)", "cmd.exe", "/c", "ver");
        Comando b = new Comando("B(hostname)", "hostname");
        Comando c = new Comando("C(whoami)", "whoami");

        // Três ordens diferentes - rotação circular para que cada processo
        // ocupe cada posição (1a, 2a e 3a) exatamente uma vez
        List<Comando> ordem1 = Arrays.asList(a, b, c);
        List<Comando> ordem2 = Arrays.asList(b, c, a);
        List<Comando> ordem3 = Arrays.asList(c, a, b);

        System.out.println("=== Comparativo de inicialização com ordem alternada ===");
        executarEMedir(ordem1, 1);
        executarEMedir(ordem2, 2);
        executarEMedir(ordem3, 3);

        System.out.println("\nAnálise: compare os tempos das POSIÇÕES (1a, 2a, 3a)");
        System.out.println("entre as execuções para identificar o efeito da ordem.");
    }
}