package com.senac.pi1.pizza;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static Pizza escolherPizza() {
        List<Pizza> pizzas = ArquivoPizza.lerPizzas();
        while (true) {
            for (var p : pizzas) {
                System.out.println(p);
            }
            System.out.println("0 - SAIR");

            var escolha = LerDados.lerInt("Digite o número da pizza");
            if (escolha == 0) return null;

            for (var p : pizzas) {
                if (p.numero() == escolha) return p;
            }
            System.out.println("Não achei essa. Vamos tentar de novo.");
        }
    }

    public static List<Pizza> escolherPizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        while (true) {
            var escolha = escolherPizza();
            if (escolha == null) break;
            pizzas.add(escolha);
        }
        return pizzas;
    }

    public static Refrigerante escolherRefri() {
        List<Refrigerante> refris = ArquivoRefrigerante.lerRefrigerantes();
        while (true) {
            for (var p : refris) {
                System.out.println(p);
            }
            System.out.println("0 - SAIR");

            var escolha = LerDados.lerInt("Digite o número do refri");
            if (escolha == 0) return null;

            for (var p : refris) {
                if (p.num() == escolha) return p;
            }
            System.out.println("Não achei essa. Vamos tentar de novo.");
        }
    }

    public static List<Refrigerante> escolherRefris() {
        List<Refrigerante> refris = new ArrayList<>();
        while (true) {
            var escolha = escolherRefri();
            if (escolha == null) break;
            refris.add(escolha);
        }
        return refris;
    }

    public static void fazerPedido() {
        System.out.println("Digite o telefone do cliente: ");
        var telefone = LerDados.lerTexto();

        var pizzas = escolherPizzas();
        System.out.println(pizzas);

        var refris = escolherRefris();
        System.out.println(refris);
       // List<Refrigerante> refris = ArquivoRefrigerante.lerRefrigerantes();


        /*while(true ){
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
                    CardapioPizzas.Bebidas();
                    break;
                case "X":
                    return;
            
                default:
                System.out.println("OPÇÃO INVALIDA!!");
                    break;
            }
        }*/
    }
}
