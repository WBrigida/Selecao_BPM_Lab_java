import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor da aresta: ");
        double aresta = sc.nextDouble();

        double area = aresta * aresta;
        System.out.println("Area = " + area);

        sc.close();

    }
}
