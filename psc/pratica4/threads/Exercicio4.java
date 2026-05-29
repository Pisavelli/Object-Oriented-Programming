package psc.pratica4.threads;

import java.util.Arrays;
import java.util.List;

public class Exercicio4 {
    // Estrutura simples para representar uma thread nomeada e sua tarefa
    static class TarefaNomeada {
        String nome;
        Runnable acao;

        TarefaNomeada(String nome, Runnable acao) {
            this.nome = nome;
            this.acao = acao;
        }
    }

    /**
     * Executa uma lista de tarefas NA ORDEM dada como threads,
     * mede o tempo de inicializacao de cada uma e imprime os resultados.
     */
    static void executarEMedir(List<TarefaNomeada> ordem, int numeroExecucao) throws InterruptedException {
        System.out.println("\n--- Execução " + numeroExecucao +
                " | Ordem: " + ordem.stream()
                .map(t -> t.nome)
                .reduce((a, b) -> a + " -> " + b)
                .orElse(""));

        Thread[] threads = new Thread[ordem.size()];

        for (int i = 0; i < ordem.size(); i++) {
            TarefaNomeada t = ordem.get(i);
            threads[i] = new Thread(t.acao, t.nome);

            // Marca o instante exatamente antes de start().
            long inicio = System.nanoTime();
            threads[i].start();
            long fim = System.nanoTime();

            long tempo = fim - inicio;
            System.out.printf("  Posição %d | Thread %s | Tempo = %d ns (%.3f us)%n",
                    i + 1, t.nome, tempo, tempo / 1_000.0);
        }

        // Espera todas as threads terminarem antes da proxima execucao,
        // garantindo que uma rodada nao contamine a seguinte.
        for (Thread th : threads) {
            th.join();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Definimos 3 tarefas distintas: A, B e C.
        // Mantemos as tarefas leves e similares em peso.
        TarefaNomeada a = new TarefaNomeada("A", () -> {
            int s = 0; for (int i = 0; i < 100; i++) s += i;
        });
        TarefaNomeada b = new TarefaNomeada("B", () -> {
            int s = 1; for (int i = 1; i < 100; i++) s *= 2;
        });
        TarefaNomeada c = new TarefaNomeada("C", () -> {
            String x = ""; for (int i = 0; i < 50; i++) x += "x";
        });

        // Três ordens — rotação circular para que cada thread
        // ocupe cada posição (1a, 2a e 3a) exatamente uma vez.
        List<TarefaNomeada> ordem1 = Arrays.asList(a, b, c);
        List<TarefaNomeada> ordem2 = Arrays.asList(b, c, a);
        List<TarefaNomeada> ordem3 = Arrays.asList(c, a, b);

        System.out.println("=== Comparativo de inicialização de threads com ordem alternada ===");
        executarEMedir(ordem1, 1);
        executarEMedir(ordem2, 2);
        executarEMedir(ordem3, 3);

        System.out.println("\nAnálise: compare os tempos das POSIÇÕES (1a, 2a, 3a)");
        System.out.println("entre as execuções para identificar o efeito da ordem.");
    }
}