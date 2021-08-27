package secao.oito.aulas.entities;

public class CurrencyConverter {

        public static final double IOF = 0.06;

        public static double reaisPrice(double dollarPrice, double dollarBoght) {
            return dollarPrice * dollarBoght + (dollarPrice * dollarBoght * IOF);
        }


}
