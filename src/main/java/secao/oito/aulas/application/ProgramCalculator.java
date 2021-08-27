package secao.oito.aulas.application;

import secao.oito.aulas.entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCalculator {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double circumference = Calculator.circumference(radius);
        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);

        sc.close();

    }
}
