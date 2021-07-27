package secao.cinco.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSete {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double coordenadaX = sc.nextDouble();
        double coordenadaY = sc.nextDouble();

        if (coordenadaX == 0 && coordenadaY == 0) {
            System.out.println("Origem");
        }
        else if (coordenadaX > 0.0 && coordenadaY > 0.0) {
            System.out.println("Quadrante 1");
        } else if (coordenadaX == 0.0) {
            System.out.println("Eixo X");
        } else if (coordenadaY == 0.0) {
            System.out.println("Eixo Y");
        } else if (coordenadaX < 0.0 && coordenadaY > 0.0) {
            System.out.println("Quadrante 2");
        } else if (coordenadaX < 0.0 && coordenadaY < 0.0) {
            System.out.println("Quadrante 3");
        } else {
            System.out.println("Quadrante 4");
        }

        sc.close();
    }
}
