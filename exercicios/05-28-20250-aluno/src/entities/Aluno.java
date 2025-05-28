package entities;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double notaFinal;
    public double pontos;

    public double calcularNota() {
        return (nota1 + nota2 + nota3);
    }
    public double pontosFaltantes(){
        return (60.00 - calcularNota());
    }

}
