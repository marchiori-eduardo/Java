import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario = "Eduardo123";


        System.out.println("Digite seu usuário:");
        String user = sc.next();
        while (!Objects.equals(user, "Eduardo123")){
            System.out.println("Usuário inválido");
            user = sc.next();
        }

        System.out.println("Digite sua senha de acesso:");
        int password = sc.nextInt();
        while (password != 2000){
            System.out.println("Senha inválida");
            password = sc.nextInt();
        }
        System.out.println("Login com sucesso");

        sc.close();
    }
}
