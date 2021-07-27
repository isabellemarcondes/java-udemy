package secao.cinco.exercicios;

import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int duracaoJogo;
        int horaInicio = sc.nextInt();
        int horaFim = sc.nextInt();

        if (horaFim > horaInicio) {
            duracaoJogo = horaFim - horaInicio;
        } else {
            duracaoJogo = 24 - horaInicio + horaFim;
        }

        System.out.println("O jogo durou " + duracaoJogo + " horas.");

        sc.close();
    }
}
