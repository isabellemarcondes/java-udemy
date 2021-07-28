package secao.cinco.aulas;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        String conversaoDia;

        switch (dia) {
            case 1:
                conversaoDia = "Domingo";
                break;
            case 2:
                conversaoDia = "Segunda";
                break;
            case 3:
                conversaoDia = "Terça";
                break;
            case 4:
                conversaoDia = "Quarta";
                break;
            case 5:
                conversaoDia = "Quinta";
                break;
            case 6:
                conversaoDia = "Sexta";
                break;
            case 7:
                conversaoDia = "Sábado";
                break;
            default:
                conversaoDia = "Inválido";
                break;
        }

        System.out.println("Dia da semana: " + conversaoDia);

        sc.close();
    }
}
