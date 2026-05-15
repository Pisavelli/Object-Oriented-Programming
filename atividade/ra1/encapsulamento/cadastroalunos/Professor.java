package atividade.ra1.encapsulamento.cadastroalunos;

public class Professor {
    public String nome;
    private int id;

    public Professor(String nome, int id) {
        this.nome = nome;
        this.id = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public int getId() {
        return id;
    }
}
