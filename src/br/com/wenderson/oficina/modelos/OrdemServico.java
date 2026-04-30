package br.com.wenderson.oficina.modelos;

public class OrdemServico {

    private Cliente cliente;
    private Veiculo veiculo;
    private Peca peca;
    private Servico servico;
    private StatusOrdem status;

    public OrdemServico(Cliente cliente, Veiculo veiculo, Peca peca, Servico servico) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.peca = peca;
        this.servico = servico;
        this.status = StatusOrdem.ABERTA;
    }

    public double calcularTotal() {
        double totalPeca = peca.getTotal();
        double totalServico = servico.getValor();

        return totalPeca + totalServico;
    }

    public void iniciar() {
        this.status = StatusOrdem.EM_ANDAMENTO;
    }

    public void finalizar() {
        this.status = StatusOrdem.FINALIZADA;
    }

    public void cancelar() {
        this.status = StatusOrdem.CANCELADA;
    }


    @Override
    public String toString() {
        return "===== ORDEM DE SERVIÇO =====" +
                "\nStatus: " + status +
                "\n" + cliente +
                "\n" + veiculo +
                "\n\n--- ITENS ---" +
                "\n" + peca +
                "\nServiço: " + servico +
                "\n------------------------" +
                "\nTotal: R$ " + String.format("%.2f", calcularTotal());
    }
}