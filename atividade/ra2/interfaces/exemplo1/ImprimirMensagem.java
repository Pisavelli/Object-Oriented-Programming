package atividade.ra2.interfaces.exemplo1;

public class ImprimirMensagem implements Operacao {
    @Override
    public void executar() {
        System.out.println("Executando a operação de impressão!");
    }

    public void testarMensagem() {
        System.out.println("Testar mensagem");
    }
}
