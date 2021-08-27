package secao.oito.exercicios.application;

import secao.oito.exercicios.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class ProgramFuncionario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + funcionario);
        System.out.println();
        System.out.println("Qual a porcentagem deseja aumentar?");
        double porcentagem = sc.nextDouble();
        funcionario.aumentoSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);

        sc.close();

    }
}
