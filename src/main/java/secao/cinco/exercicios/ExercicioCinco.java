package secao.cinco.exercicios;

import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorTotal = 0;
        int codigoProduto = sc.nextInt();
        int quantidadeProduto = sc.nextInt();

        if (codigoProduto == 1) {
            valorTotal = quantidadeProduto * 4;
        } else if (codigoProduto == 2) {
            valorTotal = quantidadeProduto * 4.5;
        } else if (codigoProduto == 3) {
            valorTotal = quantidadeProduto * 5;
        } else if (codigoProduto == 4) {
            valorTotal = quantidadeProduto * 2;
        } else if (codigoProduto == 5) {
            valorTotal = quantidadeProduto * 1.5;
        } else {
            System.out.println("Código inválido!");
        }

        System.out.printf("Total: R$ %.2f%n", + valorTotal);

        sc.close();

    }
}
