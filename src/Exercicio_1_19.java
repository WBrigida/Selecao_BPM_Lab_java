import java.util.Scanner;

public class Exercicio_1_19 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da primeira nota: ");
        double p1 = sc.nextDouble();

        double media = 5.0;

        double p2 = media * 2.0 - p1;
        System.out.printf("Você precisa tirar: %.2f%n" , p2);

        sc.close();
    }
}
