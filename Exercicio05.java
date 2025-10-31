package Lista08;

import java.util.Scanner;

public class Exercicio05 {
    public static double somaImposto(double taxaImposto, double custo) {
        return custo * ((taxaImposto / 100) + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um custo: ");
        double custo = scanner.nextDouble();

        System.out.println("Taxa do meu imposto (Ex: 25): ");
        double taxaImposto = scanner.nextDouble();

        scanner.close();

        System.out.println("Novo valor: " + somaImposto(taxaImposto, custo));
    }
}
