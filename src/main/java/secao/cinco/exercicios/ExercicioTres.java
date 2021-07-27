package secao.cinco.exercicios;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();

        if (numeroUm % numeroDois == 0 || numeroDois % numeroUm == 0) {
            System.out.println("Os números são múltiplos.");
        } else {
            System.out.println("Os números não são múltiplos.");
        }

        sc.close();
    }

}
