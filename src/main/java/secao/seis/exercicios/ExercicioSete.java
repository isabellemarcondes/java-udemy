package secao.seis.exercicios;

import java.util.Scanner;

public class ExercicioSete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        double divisao;

        for(int i = 0 ; i < numero ; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if(b == 0) {
                System.out.println("Divisao impossivel");
            } else {
                divisao = (double) a / b;
                System.out.println(divisao);
            }
        }

        sc.close();
    }
}
