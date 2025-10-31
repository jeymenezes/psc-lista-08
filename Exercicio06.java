package Lista08;

import java.util.Scanner;

public class Exercicio06 {
    public static String tipoHora(int horas, int minutos) {
        if (horas > 12) {
            return "P";
        } else if (horas == 12) {
            if (minutos > 0) {
                return "P";
            }
        }

        return "A";
    }

    public static void retornaHorario(int horas, int minutos) {
        String tipo = tipoHora(horas, minutos);

        if (tipo.equals("P")) {
            tipo = "P.M";

            horas -= 12; // horas = horas - 12
        } else {
            tipo = "A.M";
        }

        System.out.println(horas + ":" + minutos + " " + tipo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantas horas são: ");
        int horas = scanner.nextInt();

        System.out.println("Digite quantos minutos: ");
        int minutos = scanner.nextInt();

        scanner.close();

        retornaHorario(horas, minutos);
    }

}
