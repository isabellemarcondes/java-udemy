package secao.seis.exercicios;

import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for (int i = 1 ; i <= numero ; i++) {
            int quadradoNumero = (int) Math.pow(i, 2);
            int cuboNumero = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d%n", i, quadradoNumero, cuboNumero);
        }

        sc.close();
    }
}
