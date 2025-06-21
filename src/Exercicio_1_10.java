import java.util.Scanner;

public class Exercicio_1_10 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double a, b;
        System.out.println("Digite o primeiro valor: ");
        a = sc.nextFloat();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextFloat();

        double media = Math.sqrt(a * b);
        System.out.println("A média geométrica dos dois valores é: " + media);

        sc.close();
    }
}
