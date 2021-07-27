package secao.cinco.exercicios;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("O número " + numero + " é NEGATIVO.");
        } else {
            System.out.println("O número " + numero + " NÃO é NEGATIVO.");
        }

        sc.close();
    }
}
