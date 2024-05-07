import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        while(true){
        System.out.println("===OPÇÕES DE PEDIDO===");
        System.out.println("1- CARDAPIO DE PIZZAS");
        System.out.println("2- CARDAPIO DE PIZZAS DOCES");
        System.out.println("3- REFRIGERANTES");
        System.out.println("X- SAIR DO MENU");

        Scanner entrada = new Scanner(System.in);
        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                CardapioPizzas p1 = new CardapioPizzas();
                    p1.TAMANHOSpizzas();
                    p1.sabores();
                break;
            case 2:
                      p1.PizzaDoce();
                break;
            case 3:
                     p1.Refrigerantes();
                break;
        
            default:
                break;
        }
    }
}
    
}
