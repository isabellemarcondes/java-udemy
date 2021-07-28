package secao.seis.exercicios;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tentativa = sc.nextInt();
        int senhaCorreta = 2002;

        while (tentativa != senhaCorreta) {
            System.out.println("Senha Invalida");
            tentativa = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
