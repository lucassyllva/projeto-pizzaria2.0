package com.senac.pi1.pizza;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Pizzaria {

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        while (true) {
             System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("A - Fazer pedido");
            System.out.println("B1 - Lista de pizzas salgadas");//cardapio...
            System.out.println("B2 - Lista de pizzas doces");//cardapio...
            System.out.println("C - Cadastrar cliente");//cadastro pronto
            System.out.println("D - Cadastrar pizza");
            System.out.println("E - Lista de Refrigerantes ");
            System.out.println("E2- Cadastrar Refrigerantes ");
            System.out.println("F - Controle de pedido");
            System.out.println("G - Listar clientes");//lista pronta
            System.out.println("H - Procurar cliente por nome");
            System.out.println("I - Procurar cliente por telefone");
            System.out.println("X - Sair");
            System.out.println();
            System.out.print("Digite a sua escolha: ");
            var escolha = LerDados.lerTexto().toUpperCase();
            System.out.println();

            if (escolha.equals("A")) {
                Menu.fazerPedido();
            } else if (escolha.equals("B1")) {
                CardapioPizzas.saboresSalgados();
            } else if (escolha.equals("B2")) {
                CardapioPizzas.saboresDoces();
            } else if (escolha.equals("C")) {
                MenuCliente.cadastrarCliente();
            } else if (escolha.equals("D")) {
                CardapioPizzas.cadastrarPizza();
            } else if (escolha.equals("E")) {
                CardapioPizzas.bebidas();
            } else if (escolha.equals("E2")) {
                CardapioPizzas.cadastrarRefri();
            }else if (escolha.equals("F")) {
                controlePedido();controlePedido();
            } else if (escolha.equals("G")) {
                MenuCliente.listarClientes();
            } else if (escolha.equals("H")) {
                MenuCliente.buscarClientesPorNome();
            } else if (escolha.equals("I")) {
                MenuCliente.buscarClientePorTelefone();
            } else if (escolha.equals("X")) {
               return;
            } else {
                System.out.println("Esta não é uma opção válida. Vamos tentar novamente!");
            }
        }
    }

    private static void controlePedido() {   
    }
}
