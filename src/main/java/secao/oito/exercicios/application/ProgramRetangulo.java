package secao.oito.exercicios.application;

import secao.oito.exercicios.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRetangulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Informe a largura e altura do retângulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.printf("Area = %.2f%n", retangulo.area());
        System.out.printf("Perimetro = %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());

        sc.close();

    }
}
