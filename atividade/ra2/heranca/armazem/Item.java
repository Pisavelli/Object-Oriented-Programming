package atividade.ra2.heranca.armazem;

public class Item {
    protected String codigo;
    protected double peso;

    public Item(String codigo, double peso) {
        this.codigo = codigo;
        this.peso = peso;
    }

    public void exibir() {
        System.out.println("Código: " + codigo + " | Peso: " + peso + "kg");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
