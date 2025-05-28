package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println();

        System.out.print("Qual a nota do primeiro trimestre? ");
        aluno.nota1 = sc.nextDouble();
        System.out.println();

        System.out.print("Qual a nota do segundo trimestre? ");
        aluno.nota2 = sc.nextDouble();
        System.out.println();

        System.out.print("Qual a nota do terceiro trimestre? ");
        aluno.nota3 = sc.nextDouble();
        System.out.println();


        aluno.notaFinal = aluno.calcularNota();
        aluno.pontos = aluno.pontosFaltantes();

        if (aluno.notaFinal > 100.00) {
            System.out.println("Valores digitados inválidos");
        }

        else {
            System.out.printf("Nota Final: %.2f%n", aluno.notaFinal);
            if (aluno.notaFinal < 60.00) {
                System.out.println("Reprovado");
                System.out.printf("Faltaram %.2f pontos", aluno.pontos);
                 }
            else {
                System.out.println("Aprovado");
            }
        }




        sc.close();
    }
}
