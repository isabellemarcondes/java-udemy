package secao.seis.aulas;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int soma = 0;

        for (int i = 0 ; i < numero ; i++) {

            int iteracao = sc.nextInt();
            soma += iteracao;

        }

        System.out.println(soma);
        sc.close();
    }
}
