package secao.oito.exercicios.entities;

import static java.lang.Math.*;

public class Retangulo {

    public double largura, altura;

    public double area() {

        return this.largura * this.altura;

    }

    public double perimetro() {

        return 2 * (this.largura + this.altura);

    }

    public double diagonal() {

        return sqrt(pow(this.largura, 2) + pow(this.altura, 2));

    }

}
