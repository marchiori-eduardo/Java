import java.awt.*;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int altura = (int)screenSize.getHeight();
        int largura = (int)screenSize.getWidth();
        System.out.println("Sua resolução é de: " );
        System.out.println(altura + " x " + largura);
    }
}
