package secao.seis.exercicios;

import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int coordenadaX = sc.nextInt();
        int coordenadaY = sc.nextInt();

        while (coordenadaX != 0 && coordenadaY != 0) {
            if (coordenadaX > 0 && coordenadaY > 0) {
                System.out.println("Primeiro");
            } else if (coordenadaX < 0 && coordenadaY > 0) {
                System.out.println("Segundo");
            } else if (coordenadaX < 0 && coordenadaX < 0) {
                System.out.println("Terceiro");
            } else
                System.out.println("Quarto");

            coordenadaX = sc.nextInt();
            coordenadaY = sc.nextInt();
        }


        sc.close();
    }
}
