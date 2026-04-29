package br.com.wenderson.oficina.modelos;

public class Veiculo {

    private String placa;
    private String modelo;
    private String marca;
    private String cor;
    private int anoFabricacao;

    private Cliente cliente;

    public Veiculo(String placa, String modelo, String marca, String cor, int anoFabricacao, Cliente cliente) {
        setPlaca(placa);
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.cliente = cliente;
    }



    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("Placa inválida");
        }
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Veículo: " + marca + "\nmodelo " + modelo +
                "\nPlaca: " + placa + "\ncor " + cor + "\nanoFabricacao " + anoFabricacao;
    }
}