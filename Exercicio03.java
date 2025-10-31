package Lista08;

import java.util.Scanner;

public class Exercicio03 {
    public static int somarNumeros(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um valor: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite um valor: ");
        int num3 = scanner.nextInt();

        scanner.close();

        System.out.println(somarNumeros(num1, num2, num3));
    }
}
