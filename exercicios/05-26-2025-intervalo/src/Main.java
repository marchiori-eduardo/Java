import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;
        int x = sc.nextInt();

        for (int i=0; i<x; i++) {
            int y = sc.nextInt();
            if (10 <= y  && y <= 20) {
                in = in + 1;
            }
            else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");



        sc.close();
    }
}
