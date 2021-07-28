package secao.seis.exercicios;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcaoCombustivel = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (opcaoCombustivel != 4) {
            switch (opcaoCombustivel) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }

            opcaoCombustivel = sc.nextInt();

        }

        System.out.println("Muito obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
