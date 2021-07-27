package secao.quatro.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int quantidadePeca1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();

        int quantidadePeca2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double total = (quantidadePeca1 * valorUnitario1) + (quantidadePeca2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);

        sc.close();

    }

}
