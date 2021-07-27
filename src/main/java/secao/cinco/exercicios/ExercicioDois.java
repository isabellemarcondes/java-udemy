package secao.cinco.exercicios;

import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é IMPAR.");
        }

        sc.close();
    }
}
