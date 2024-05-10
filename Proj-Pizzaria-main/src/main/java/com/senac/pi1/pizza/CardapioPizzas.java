package com.senac.pi1.pizza;

import java.util.List;

public class CardapioPizzas {
    /*int valorGrande = 45;
    int valorMedia = 35;
    int valorBroto = 25;
    int medida;
    int refriG =10;
    int refriLata =5;*/
    
    public static void TAMANHOSpizzas (){
        //System.out.println("MUSSARELA - TAMANHO FAMILIA");
        System.out.println("QUAL O TAMANHO DA PIZZA ?");
        System.out.println("TAMANHO 1- Grande");
        System.out.println("TAMANHO 2- Medio");
        System.out.println("TAMANHO 3- Broto");
        int medida = LerDados.lerInt("Digite novamente");
        
        /*switch (medida) {
            case 1:
                medida= this.valorGrande;
                
                break;
            case 2:
                medida= this.valorMedia;
                break;
            case 3:
                medida= this.valorBroto;
                break;
        
            default:
                System.out.println("OPÇÃO INVALIDA");
                break;
        }*/
        
    }

    private static List<Pizza> TODAS_PIZZAS = List.of(
        new Pizza(1, "Mussarela", "média", 20, false),
        new Pizza(2, "Marguerita", "média", 30, false),
        new Pizza(3, "Napolitana", "pequena", 40, false),
        new Pizza(4, "4 queijos", "grande", 60, false),
        new Pizza(5, "brigadeiro", "grande", 60, true),
        new Pizza(6, "romeu e julieta", "grande", 60, true)
    );

   public static void saboresSalgados(){
        for (Pizza p : TODAS_PIZZAS) {
            if (p.doce()) continue;
            System.out.println(p.numero() + " - " + p.nome() + " - " + p.tamanho() + " - R$ " + p.preco());
        }
                /*System.out.println("MUSSARELA - " + medida+",00 R$");
                System.out.println("01- CALABRESA - " + medida+",00 R$");
                System.out.println("02- MARGUERITA - " + medida+",00 R$");
                System.out.println("03- 4 QUEIJOS - " + medida+",00 R$");
                System.out.println("04- TOSCANA - " + medida+",00 R$");
                System.out.println("05- ALHO FRITO - " + medida+",00 R$");
                System.out.println("06- PORTUGUESA - " + medida+",00 R$");
                System.out.println("07- FRANGO COM CATUPIRY - " + medida+",00 R$");
                System.out.println("08- NAPOLITANA - " + medida+",00 R$");
                System.out.println("09- BROCOLIS - " + medida+",00 R$");
                System.out.println("10- PALMITO - " + medida+",00 R$");
                System.out.println("11- ATUM - " + medida+",00 R$");
                System.out.println("12- BOLONHESA - " + medida+",00 R$");*/

    }

    public static void saboresDoces(){
        for (Pizza p : TODAS_PIZZAS) {
            if (!p.doce()) continue;
            System.out.println(p.numero() + " - " + p.nome() + " - " + p.tamanho() + " - R$ " + p.preco());
        }
        /*System.out.println("01- CHOCOLATE COM MORANGO "+valorBroto+",00R$");
        System.out.println("02- CHURROS "+valorBroto+",00R$");
        System.out.println("03- CHOCOLATE "+valorBroto+",00R$");
        System.out.println("04- LEITE NINHO COM NUTELLA "+valorBroto+",00R$");*/

    }

    public static void Refrigerantes(){
        /*System.out.println("01- COCA-COLA 2L "+refriG+",00R$");
        System.out.println("02- GUARRANA 1,5L "+refriG+",00R$");
        System.out.println("03- FANTA LARANJA 2L "+refriG+",00R$");
        System.out.println("04- COCA-COLA LATA 350ML "+refriLata+",00R$");
        System.out.println("05- GUARRANA LATA 350ML"+refriLata+",00R$");
        System.out.println("06- SPLITE LATA 350ML"+refriLata+",00R$");*/
    }

}
