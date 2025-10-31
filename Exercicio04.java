package Lista08;

import java.util.Scanner;

public class Exercicio04 {
    public static String retornarLetra(int num) {
        if (num > 0) {
            return "P";
        } else {
            return "N";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        scanner.close();

        System.out.println(retornarLetra(valor));
    }
}
