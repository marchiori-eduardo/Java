package application;

import entities.Aluno;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Aluno> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int A = sc.nextInt();
        for (int i = 1; i <= A; i++) {
            int aluno = sc.nextInt();
            set.add(new Aluno(aluno));
        }
        System.out.print("How many students for course B? ");
        int B = sc.nextInt();
        for (int i = 1; i <= B; i++) {
            int aluno = sc.nextInt();
            set.add(new Aluno(aluno));
        }
        System.out.print("How many students for course C? ");
        int C = sc.nextInt();
        for (int i = 1; i <= C; i++) {
            int aluno = sc.nextInt();
            set.add(new Aluno(aluno));
        }

        System.out.print("Total students: " + set.size());

        sc.close();
    }
}
