import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor da diagonal: ");
        double diagonal = sc.nextDouble();

        double area = diagonal * diagonal / 2;
        System.out.println("Area = " + area);

        sc.close();

    }
}
