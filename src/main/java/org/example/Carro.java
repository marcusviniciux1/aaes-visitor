package org.example;

public class Carro implements Veiculo {

    private String placa;
    private String marca;
    private int anoFabricacao;

    public Carro(String placa, String marca, int anoFabricacao) {
        this.placa = placa;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCarro(this);
    }
}