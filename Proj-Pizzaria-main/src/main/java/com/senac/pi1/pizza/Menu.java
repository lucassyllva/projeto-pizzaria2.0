package com.senac.pi1.pizza;

public class Menu {
    public static void pizzas() {
        while(true ){
            System.out.println("===OPÇÕES DE PEDIDO===");
            System.out.println("1- CARDAPIO DE PIZZAS");
            System.out.println("2- CARDAPIO DE PIZZAS DOCES");
            System.out.println("3- REFRIGERANTES");
            System.out.println("X- SAIR DO MENU");

            var escolha = LerDados.lerTexto().toUpperCase();

            switch (escolha) {
                case "1":
                    CardapioPizzas.TAMANHOSpizzas();
                    CardapioPizzas.saboresSalgados();
                    break;
                case "2":
                    CardapioPizzas.saboresDoces();
                    break;
                case "3":
                    CardapioPizzas.Refrigerantes();
                    break;
                case "X":
                    return;
            
                default:
                    break;
            }
        }
    }
}
