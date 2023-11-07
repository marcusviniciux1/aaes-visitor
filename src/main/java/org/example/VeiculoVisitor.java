package org.example;

public class VeiculoVisitor implements Visitor {

    public String exibir(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    public String exibirCarro(Carro carro) {
        return "Carro{" +
                "placa='" + carro.getPlaca() + '\'' +
                ", marca='" + carro.getMarca() + '\'' +
                ", anoFabricacao=" + carro.getAnoFabricacao() +
                '}';
    }

    public String exibirMoto(Moto moto) {
        return "Moto{" +
                "placa='" + moto.getPlaca() + '\'' +
                ", marca='" + moto.getMarca() + '\'' +
                ", anoFabricacao=" + moto.getAnoFabricacao() +
                '}';
    }

    public String exibirCaminhao(Caminhao caminhao) {
        return "Caminhao{" +
                "placa='" + caminhao.getPlaca() + '\'' +
                ", marca='" + caminhao.getMarca() + '\'' +
                ", anoFabricacao=" + caminhao.getAnoFabricacao() +
                '}';
    }
}