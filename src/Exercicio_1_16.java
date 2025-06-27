import java.util.Scanner;

public class Exercicio_1_16 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite  o valor de um ângulo em graus: ");
        double angulo = sc.nextDouble();

        double radiano = angulo * Math.PI / 180;

        double seno = Math.sin(radiano);
        double coseno = Math.cos(radiano);
        double tangente = Math.tan(radiano);
        double secante = 1 / coseno;

        System.out.printf("Seno: %.4f%n " , seno);
        System.out.printf("Coseno: %.4f%n " , coseno);
        System.out.printf("Tangente: %.4f%n " , tangente);
        System.out.printf("Secante: %.4f%n " , secante);

        sc.close();
    }
}
