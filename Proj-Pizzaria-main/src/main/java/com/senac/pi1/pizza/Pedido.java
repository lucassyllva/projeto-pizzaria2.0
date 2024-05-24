package com.senac.pi1.pizza;

import java.util.List;

public record Pedido (
    String telefone,
    List<Pizza> pizzas,
    List<Refrigerante> refris)
{

    public static Pedido lerPedido(List<String> listinha) {
        if (listinha.size() != 3) throw new IllegalArgumentException("Tamanho errado.");
        List<String> nomesPizzas = List.of(listinha.get(1).split(";"));
        List<Pizza> pizzas = /* Fazer algo */ null;
        
        List<String> nomesRefris = List.of(listinha.get(2).split(";"));
        List<Refrigerante> refris = /* Fazer algo */ null;

        return new Pedido(
            listinha.get(0),
            pizzas,
            refris
        );
    }
}
