import java.util.Scanner;

public class Exercicio_1_9 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d;
        System.out.println("Digite o primeiro valor: ");
        a = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        c = sc.nextDouble();
        System.out.println("Digite o quarto valor: ");
        d = sc.nextDouble();

        double media = a + b + c + d / 4;
        System.out.println("A média aritmética dos quatro valores é: " + media);

        sc.close();

    }
}
