import java.util.Scanner;

public class Exercicio_1_13 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de Celsius (oC): ");
        double c = sc.nextDouble();

        double f = c * 1.8 + 32;
        System.out.println("A temperatura equivalente em Fahrenheit é de:" + f + " oF");

        sc.close();
    }
}
