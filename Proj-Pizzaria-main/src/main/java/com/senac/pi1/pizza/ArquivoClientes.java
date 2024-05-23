package com.senac.pi1.pizza;

import java.util.List;

public class ArquivoClientes {
    public static void salvarClientes(List<Cliente> tudo) {
        var listona = Cliente.converterEmListas(tudo);
        Arquivo.escreverLinhas(listona, "Cliente.txt");
    }

    public static List<Cliente> lerArquivo() {
        var linhas = Arquivo.lerLinhas("Cliente.txt");
        return Cliente.lerClientes(linhas);
    }
    
}
