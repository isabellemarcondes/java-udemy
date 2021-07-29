package secao.seis.exercicios;

import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        for(int i = 0 ; i < numero ; i++) {
            int iteracao = sc.nextInt();

            if (iteracao >= 10 && iteracao <= 20) {
                dentroIntervalo += 1;
            } else {
                foraIntervalo += 1;
            }
        }

        System.out.println(dentroIntervalo + " in");
        System.out.println(foraIntervalo + " out");
        sc.close();
    }
}
