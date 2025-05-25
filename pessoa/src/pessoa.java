//Concatenando vários elementos em um mesmo comando de escrita

public class pessoa {
    public static void main(String[] args) {

        String nome = "Maria";
        int idade = 34;
        double renda = 4500.00;

        System.out.printf("%s tem %d anos e recebe R$%.2f reais%n", nome, idade , renda);
    }
}
