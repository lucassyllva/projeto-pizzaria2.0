package com.senac.pi1.pizza;

import java.util.List;

public class ArquivoPizza {
    public static void salvarPizzas(List<Pizza> pizzas) {
        var listona = Pizza.converterEmListas(pizzas);
        Arquivo.escreverLinhas(listona, "pizzas.txt");
    }

    public static List<Pizza> lerPizzas() {
        var linhas = Arquivo.lerLinhas("pizzas.txt");
        return Pizza.lerPizzas(linhas);
    }
}
