package com.senac.pi1.pizza;

import java.util.List;

public class ArquivoRefrigerante {
    public static void salvarRefrigerantes(List<Refrigerante> Refrigerantes){
        var listona = Refrigerante.converterEmListas(Refrigerantes);
        Arquivo.escreverLinhas(listona, "refrigerantes.txt");
    }

    public static List<Refrigerante> lerRefrigerantes(){
        var linhas = Arquivo.lerLinhas("refrigerantes.txt");
        return Refrigerante.lerRefrigerantes(linhas);
    }    
}
