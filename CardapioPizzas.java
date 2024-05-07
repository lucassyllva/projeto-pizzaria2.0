import java.util.Scanner;
public class CardapioPizzas {
    int valorGrande = 45;
    int valorMedia = 35;
    int valorBroto = 25;
    int medida;
    int refriG =10;
    int refriLata =5;
    
    void TAMANHOSpizzas (){
        //System.out.println("MUSSARELA - TAMANHO FAMILIA");
        System.out.println("QUAL O TAMANHO DA PIZZA ?");
        System.out.println("TAMANHO 1- Grande");
        System.out.println("TAMANHO 2- Medio");
        System.out.println("TAMANHO 3- Broto");
        Scanner tamanhos = new Scanner(System.in);
         medida = tamanhos.nextInt();
        
        switch (medida) {
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
        }
        
    }
    void sabores(){
        System.out.println("MUSSARELA - " + medida+",00 R$");
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
                System.out.println("12- BOLONHESA - " + medida+",00 R$");

    }

    void PizzaDoce(){
        System.out.println("01- CHOCOLATE COM MORANGO "+valorBroto+",00R$");
        System.out.println("02- CHURROS "+valorBroto+",00R$");
        System.out.println("03- CHOCOLATE "+valorBroto+",00R$");
        System.out.println("04- LEITE NINHO COM NUTELLA "+valorBroto+",00R$");

    }

    void Refrigerantes(){
        System.out.println("01- COCA-COLA 2L "+refriG+",00R$");
        System.out.println("02- GUARRANA 1,5L "+refriG+",00R$");
        System.out.println("03- FANTA LARANJA 2L "+refriG+",00R$");
        System.out.println("04- COCA-COLA LATA 350ML "+refriLata+",00R$");
        System.out.println("05- GUARRANA LATA 350ML"+refriLata+",00R$");
        System.out.println("06- SPLITE LATA 350ML"+refriLata+",00R$");
    }

}
