package secao.oito.aulas.application;

import secao.oito.aulas.entities.CurrencyConverter;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class ProgramCurrencyConverter {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarBought = sc.nextDouble();

        double reais = CurrencyConverter.reaisPrice(dollarPrice, dollarBought);

        System.out.printf("Amount to be paid in reais: %.2f%n", reais);

    }


}
