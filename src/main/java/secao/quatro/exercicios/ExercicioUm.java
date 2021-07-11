package secao.quatro.exercicios;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();

        int resultado = numeroUm + numeroDois;

        System.out.println("SOMA = " + resultado);

        sc.close();

    }
}
