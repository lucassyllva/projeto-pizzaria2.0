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

    /*private static List<Pizza> TODAS_PIZZAS = List.of(
        new Pizza(1, "Mussarela", "média", 20, false),
        new Pizza(2, "Marguerita", "média", 30, false),
        new Pizza(3, "Napolitana", "pequena", 40, false),
        new Pizza(4, "4 queijos", "grande", 60, false),
        new Pizza(5, "brigadeiro", "grande", 60, true),
        new Pizza(6, "romeu e julieta", "grande", 60, true)
    );*/

    public static void cadastrarPizza() {
        var pizzas = ArquivoPizza.lerPizzas();
        System.out.println("Qual é o nome da pizza?");
        var nome = LerDados.lerTexto();
        System.out.println("Qual é o tamanho da pizza?");
        var tamanho = LerDados.lerTexto();
        System.out.println("Qual é o preço da pizza?");
        var preco = LerDados.lerDouble("Digite um número! ");
        System.out.println("É doce?");
        var doce = LerDados.lerSimNao("Escolha sim ou não.");
        var pizza = new Pizza(pizzas.size() + 1, nome, tamanho, preco, doce);
        pizzas.add(pizza);
        ArquivoPizza.salvarPizzas(pizzas);
    }

   public static void saboresSalgados(){
        var pizzas = ArquivoPizza.lerPizzas();
        for (Pizza p : pizzas) {
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
        var pizzas = ArquivoPizza.lerPizzas();
        for (Pizza p : pizzas) {
            if (!p.doce()) continue;
            System.out.println(p.numero() + " - " + p.nome() + " - " + p.tamanho() + " - R$ " + p.preco());
        }
        /*System.out.println("01- CHOCOLATE COM MORANGO "+valorBroto+",00R$");
        System.out.println("02- CHURROS "+valorBroto+",00R$");
        System.out.println("03- CHOCOLATE "+valorBroto+",00R$");
        System.out.println("04- LEITE NINHO COM NUTELLA "+valorBroto+",00R$");*/

    }

    private static List<Refrigerantes> Bebidas = List.of(
        new Refrigerantes( 1,  "COCA-COLA 2L", 10.00),
        new Refrigerantes(2, "GUARANA 1,5L", 8.00),
        new Refrigerantes(3, " FANTA LARANJA 2L", 10.00),
        new Refrigerantes(4, "COCA-COLA LATA 350ML", 5.00),
        new Refrigerantes(5, " GUARRANA LATA 350ML", 5.00),
        new Refrigerantes(6, "SPLITE LATA 350ML", 5.00)
    );

    public static void Bebidas(){
        for(Refrigerantes r : Bebidas){
            System.out.println(r.num() + " - "+ r.tipo()+" - "+ r.preco()+"R$");
        }
        
        
        /*new Refrigerantes( 1,  "COCA-COLA 2L", 10.00);
        new Refrigerantes(2, "GUARANA 1,5L", 8.00);
        new Refrigerantes(3, " FANTA LARANJA 2L", 10.00);
        new Refrigerantes(4, "COCA-COLA LATA 350ML", 5.00);
        new Refrigerantes(5, " GUARRANA LATA 350ML", 5.00);
        new Refrigerantes(6, "SPLITE LATA 350ML", 5.00);*/
        /*System.out.println("01- COCA-COLA 2L "+refriG+",00R$");
        System.out.println("02- GUARRANA 1,5L "+refriG+",00R$");
        System.out.println("03- FANTA LARANJA 2L "+refriG+",00R$");
        System.out.println("04- COCA-COLA LATA 350ML "+refriLata+",00R$");
        System.out.println("05- GUARRANA LATA 350ML"+refriLata+",00R$");
        System.out.println("06- SPLITE LATA 350ML"+refriLata+",00R$");*/
    }

}
