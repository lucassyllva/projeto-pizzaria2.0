package com.senac.pi1.pizza;

public class MenuCliente {
    public static void cadastrarCliente() {
        var clientes = ArquivoClientes.lerArquivo();
        
        System.out.print("Digite o nome: ");
        var nome = LerDados.lerTexto();

        System.out.print("Digite o telefone: ");
        var telefone = LerDados.lerInt("Digita um número, por favor: ");

        System.out.print("Digite o endereço: ");
        var endereco = LerDados.lerTexto();

        System.out.print("Digite o cep: ");
        var cep = LerDados.lerInt("Digita um número, por favor: ");

        var c = new Cliente(nome, telefone, endereco, cep);
        clientes.add(c);
        ArquivoClientes.salvarClientes(clientes);
    }

    public static void listarClientes() {
        var clientes = ArquivoClientes.lerArquivo();
        for (var c : clientes) {
            System.out.println(c);
        }
    }

    public static void buscarClientesPorNome() {
        System.out.print("Digite o nome: ");
        var nome = LerDados.lerTexto();
        var clientes = ArquivoClientes.lerArquivo();
        var resultado = Cliente.buscarPorNome(clientes, nome);
        if (!resultado.isEmpty()) {
            for (var c : resultado) {
                System.out.println(c);
            }
        } else {
            System.out.println("Não achei");
        }
    }

    public static void buscarClientePorTelefone() {
        System.out.print("Digite o telefone: ");
        var telefone = LerDados.lerInt("Digita um número, por favor: ");
        var clientes = ArquivoClientes.lerArquivo();
        var resultado = Cliente.buscarPorTelefone(clientes, telefone);
        if (resultado.isPresent()) {
            var encontrado = resultado.get();
            System.out.println(encontrado);
        } else {
            System.out.println("Não achei");
        }
    }
}