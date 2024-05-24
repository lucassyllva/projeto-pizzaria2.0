package com.senac.pi1.pizza;

import java.util.List;

public class CardapioPizzas {
    
    
    public static void TAMANHOSpizzas (){
        //System.out.println("MUSSARELA - TAMANHO FAMILIA");
        System.out.println("QUAL O TAMANHO DA PIZZA ?");
        System.out.println("TAMANHO 1- Grande");
        System.out.println("TAMANHO 2- Medio");
        System.out.println("TAMANHO 3- Broto");
        int medida = LerDados.lerInt("Digite novamente");
        
        switch (medida) {
            case 1:
                saboresSalgados();
               
                
                break;
            case 2:
               // medida= this.valorMedia;
                break;
            case 3:
               // medida= this.valorBroto;
                break;
        
            default:
                System.out.println("OPÇÃO INVALIDA");
                break;
        }
        
    }
    public static void cadastrarPizza() {
        System.out.println("Qual é o nome da pizza?");
        var nome = LerDados.lerTexto();
        System.out.println("Qual é o tamanho da pizza?");
        var tamanho = LerDados.lerTexto();
        System.out.println("Qual é o preço da pizza?");
        var preco = LerDados.lerDouble("Digite um número! ");
        System.out.println("É doce?");
        var doce = LerDados.lerSimNao("Escolha sim ou não.");
    
        var pizzas = ArquivoPizza.lerPizzas();
        var pizza = new Pizza(pizzas.size() + 1, nome, tamanho, preco, doce);
        pizzas.add(pizza);
        ArquivoPizza.salvarPizzas(pizzas);
    }

    public static void cadastrarRefri() {
        System.out.println("Qual é o numero do refri?");
        var num = LerDados.lerInt("Põe um número, cara! ");
        System.out.println("Qual é o nome do Refrigerante");
        var nome = LerDados.lerTexto();
        System.out.println("Qual é o preço do Refrigerante?");
        var preco = LerDados.lerDouble("Digite um número! ");
    
        var refris = ArquivoRefrigerante.lerRefrigerantes();
        var refri  = new Refrigerante(num, nome, preco);
        refris.add(refri);
        ArquivoRefrigerante.salvarRefrigerantes(refris);
    }

   public static void saboresSalgados(){
        var pizzas = ArquivoPizza.lerPizzas();
        for (Pizza p : pizzas) {
            if (p.doce()) continue;
            System.out.println(p.numero() + " - " + p.nome() + " - " + p.tamanho() + " - R$ " + p.preco());
        }
               
    }

    public static void saboresDoces(){
        var pizzas = ArquivoPizza.lerPizzas();
        for (Pizza p : pizzas) {
            if (!p.doce()) continue;
            System.out.println(p.numero() + " - " + p.nome() + " - " + p.tamanho() + " - R$ " + p.preco());
        }
       
    }

    /*private static List<Refrigerante> Bebidas = List.of(
        new Refrigerante( 1,  "COCA-COLA 2L", 10.00),
        new Refrigerante(2, "GUARANA 1,5L", 8.00),
        new Refrigerante(3, " FANTA LARANJA 2L", 10.00),
        new Refrigerante(4, "COCA-COLA LATA 350ML", 5.00),
        new Refrigerante(5, " GUARRANA LATA 350ML", 5.00),
        new Refrigerante(6, "SPLITE LATA 350ML", 5.00)
    );*/

    public static void bebidas(){
       //System.out.println(Bebidas);
        List<Refrigerante> refris = ArquivoRefrigerante.lerRefrigerantes();
        for(Refrigerante r : refris){
            System.out.println(r.num() + " - "+ r.nome()+" - R$ "+ r.preco());
            //int escolherRefri = LerDados.lerInt(null);
        }
              //int escolherRefri = LerDados.lerInt(null);
              //escolherRefri = new 
    }

}
