package br.com.wenderson.oficina.modelos;

public class Peca {
    private String nome;
    private double valorUnitario;
    private int quantidade;

    public Peca(String nome, double valorUnitario, int quantidade) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotal() {
        return valorUnitario * quantidade;
    }

    @Override
    public String toString() {
        return "Peça: " + nome +
                "\nValor unitário: R$ " + valorUnitario +
                "\nQuantidade: " + quantidade +
                "\nTotal: R$ " + getTotal();
    }
}