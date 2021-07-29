package secao.seis.exercicios;

import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int impares = 0;

        for(int i = 0 ; i <= numero ; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
