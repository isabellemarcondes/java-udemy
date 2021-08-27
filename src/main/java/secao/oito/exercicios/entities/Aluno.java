package secao.oito.exercicios.entities;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {

        return nota1 + nota2 + nota3;

    }

    public void aprovação() {

        if(notaFinal() < 60.0) {
            System.out.println("Reprovado");
            double pontosFaltantes = 60.0 - notaFinal();
            System.out.printf("Faltando %.2f pontos", pontosFaltantes);
        } else {
            System.out.println("Passou");
        }

    }

}
