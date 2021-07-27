package secao.quatro.aulas;

public class Casting {

    public static void main(String[] args) {

        int a, b;
        double result;

        a = 5;
        b = 2;

        result = (double) a / b;

        System.out.println(result);

        double c;
        int d;

        c = 5.0;
        d = (int) c;

        System.out.println(d);

    }
}
