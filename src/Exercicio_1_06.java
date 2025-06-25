import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        double diametro = 2 * raio;

        double area = Math.PI * raio * raio;
        System.out.printf("Area = %.0f%n", area);

        sc.close();

    }
}
