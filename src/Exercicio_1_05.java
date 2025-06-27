import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Didigte o valor do diâmetro: ");
        double diametro = sc.nextDouble();
        double raio = diametro / 2;

        double volume = 4 * Math.PI * raio * raio * raio / 3;
        System.out.printf("Volume = %.0f%n", volume);

        sc.close();

    }

}
