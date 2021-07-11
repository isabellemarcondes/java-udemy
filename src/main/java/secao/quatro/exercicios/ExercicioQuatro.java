package secao.quatro.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        double salarioFuncionario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = " + salarioFuncionario);

        sc.close();

    }
}
