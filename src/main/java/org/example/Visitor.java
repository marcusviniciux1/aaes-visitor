package org.example;

public interface Visitor {

    String exibirCarro(Carro carro);

    String exibirCaminhao(Caminhao caminhao);

    String exibirMoto(Moto moto);

}