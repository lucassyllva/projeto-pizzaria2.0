package com.senac.pi1.pizza;

import java.util.ArrayList;
import java.util.List;

public record Pizza(
    int numero,
    String nome,
    String tamanho,
    double preco,
    boolean doce
) {
    public List<String> converterEmLista() {
        return List.of(
            "" + numero,
            nome,
            tamanho,
            "" + preco,
            "" + doce
        );
    }

    public static Pizza lerPizza(List<String> listinha) {
        if (listinha.size() != 5) throw new IllegalArgumentException("Tamanho errado.");
        return new Pizza(
            Integer.parseInt(listinha.get(0)),
            listinha.get(1),
            listinha.get(2),
            Double.parseDouble(listinha.get(3)),
            listinha.get(4).equals("true")
        );
    }

    public static List<String> converterEmListas(List<Pizza> pizzas) {
        List<String> listona = new ArrayList<>();
        for (var p : pizzas) {
            var listinha = p.converterEmLista();
            listona.addAll(listinha);
        }
        return listona;
    }

    public static List<Pizza> lerPizzas(List<String> listona) {
        List<Pizza> pizzas = new ArrayList<>();
        for (var i = 0; i < listona.size(); i += 5) {
            List<String> listinha = listona.subList(i, i + 5);
            var pizza = lerPizza(listinha);
            pizzas.add(pizza);
        }
        return pizzas;
    }
}
