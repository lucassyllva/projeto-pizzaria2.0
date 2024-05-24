package com.senac.pi1.pizza;

import java.util.List;
import java.util.ArrayList;



public record Refrigerante(
    int num,
    String nome,
    double preco
) {    
    public List<String> converterEmlista(){
        return List.of(
            "" + num,
            nome,
            "" + preco
        );
    }

    public static Refrigerante lerRefrigerante(List<String> listinha){
        if (listinha.size() != 3) throw new IllegalArgumentException("Lista tá com tamanho errado, deu chabu.");
        return new Refrigerante(
            Integer.parseInt(listinha.get(0)),
            listinha.get(1),
            Double.parseDouble(listinha.get(2))
        );
    }

    public static List<String> converterEmListas(List<Refrigerante> Refrigerantes){
        List<String> listona = new ArrayList<>();
        for (var p : Refrigerantes){
            var listinha = p.converterEmlista();
            listona.addAll(listinha);
        } 
        return listona;
    }

    public static List<Refrigerante> lerRefrigerantes(List<String> listona){
        List<Refrigerante> refrigerantes = new ArrayList<>();
        for (var i = 0; i < listona.size(); i += 3) {
            List<String> listinha = listona.subList(i, i + 3);
            refrigerantes.add(lerRefrigerante(listinha));
        }
        return refrigerantes;
    }
}
