import java.util.Locale;

public class altura {
    public static void main(String[] args) {
        double x = 1.8555;

        Locale.setDefault(Locale.US);
        System.out.printf("Tenho = %.2f de altura%n", x);
    }
}
