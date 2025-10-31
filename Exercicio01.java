package Lista08;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= valor; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);

                if (j < i - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
