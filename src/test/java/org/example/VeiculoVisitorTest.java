package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoVisitorTest {

    @Test
    void deveExibirCaminhao() {
        Caminhao caminhao = new Caminhao("QTP5F71", "Volvo", 2020);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Caminhao{placa='QTP5F71', marca='Volvo', anoFabricacao=2020}", visitor.exibir(caminhao));
    }

    @Test
    void deveExibirCarro() {
        Carro carro = new Carro("CXZ7B41", "Toyota", 2021);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Carro{placa='CXZ7B41', marca='Toyota', anoFabricacao=2021}", visitor.exibir(carro));
    }

    @Test
    void deveExibirMoto() {
        Moto moto = new Moto("MSK9B10", "Honda", 2022);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Moto{placa='MSK9B10', marca='Honda', anoFabricacao=2022}", visitor.exibir(moto));
    }

}