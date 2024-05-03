package com.senac.pi1.pizza;

import java.util.Scanner;

public class LerDados {

    private static final Scanner scan = new Scanner(System.in);

    public static int lerInt(String tenteNovamente) {
        while (true) {
            var linha = scan.nextLine();
            try {
                return Integer.parseInt(linha);
            } catch (NumberFormatException erro) {
                System.out.print(tenteNovamente);
            }
        }
    }

    public static double lerDouble(String tenteNovamente) {
        while (true) {
            var linha = scan.nextLine();
            try {
                return Double.parseDouble(linha);
            } catch (NumberFormatException erro) {
                System.out.print(tenteNovamente);
            }
        }
    }

    public static String lerTexto() {
        return scan.nextLine();
    }
}