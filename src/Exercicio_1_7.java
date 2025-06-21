import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite o valor do raio da base: ");
        double raio = sc.nextDouble();

        double volume = altura * Math.PI * raio * raio / 3;
        System.out.printf("Volume = %.1f%n", volume);

        sc.close();

    }

}
