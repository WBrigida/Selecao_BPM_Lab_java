import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor da base: ");
        double base = sc.nextDouble();

        System.out.println("Digite o valor da altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        System.out.println("Area = " + area);

        sc.close();
    }

}
