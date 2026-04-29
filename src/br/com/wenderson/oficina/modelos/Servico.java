package br.com.wenderson.oficina.modelos;

public class Servico {
    private String descricao;
    private double valor;

    public Servico(String descricao, double valor) {
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("Descrição inválida");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }

        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descricao + " - R$ " + String.format("%.2f", valor);
    }
}