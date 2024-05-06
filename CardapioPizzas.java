import java.util.Scanner;
public class CardapioPizzas {
    int valorGrande = 45;
    int valorMedia = 35;
    int valorBroto = 25;
    int medida;
    
    
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
                System.out.println("CALABRESA - " + medida+",00 R$");
                System.out.println("MARGUERITA - " + medida+",00 R$");
                System.out.println("4 QUEIJOS - " + medida+",00 R$");
                System.out.println("TOSCANA - " + medida+",00 R$");
                System.out.println("ALHO FRITO - " + medida+",00 R$");
                System.out.println("PORTUGUESA - " + medida+",00 R$");
                System.out.println("FRANGO COM CATUPIRY - " + medida+",00 R$");
                System.out.println("NAPOLITANA - " + medida+",00 R$");
                System.out.println("BROCOLIS - " + medida+",00 R$");
                System.out.println("PALMITO - " + medida+",00 R$");
                System.out.println("ATUM - " + medida+",00 R$");
                System.out.println("BOLONHESA - " + medida+",00 R$");

    }
}
