package com.senac.pi1.pizza;

import java.util.List;

public class MenuCliente {
    public static void cadastrarCliente(List<Cliente> lista) {
        
        System.out.print("Digite o nome: ");
        var Nome = LerDados.lerTexto();

        System.out.print("Digite o telefone: ");
        var Telefone = LerDados.lerInt("Digita um número, por favor: ");

        System.out.print("Digite o endereço: ");
        var Endereco = LerDados.lerTexto();

        System.out.print("Digite o cep: ");
        var Cep = LerDados.lerInt("Digita um número, por favor: ");

        var c = new Cliente(Nome, Telefone, Endereco, Cep);
        lista.add(c);
    }
}