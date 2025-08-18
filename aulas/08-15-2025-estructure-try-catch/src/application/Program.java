package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program");


    }

    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        //tentativa de execução
        try {
            String[] vect = sc.nextLine().split(" ");
            //leitura de vários dados na mesma linha separados por espaços em branco e cada um será um elemento desse vetor

            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        //caso não execute e ocorra uma exceção
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace(); //imprime o ratreamento do stack
            sc.next();
        }
        //outro tipo de exceção
        catch (InputMismatchException e) {
            System.out.println("Input error!");
        }

        System.out.println("***METHOD2 END***");

        sc.close();
    }
}
