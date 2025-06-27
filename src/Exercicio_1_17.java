import java.util.Scanner;

public class Exercicio_1_17 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        double resultado = Math.pow(x, y);
        double expo = Math.exp(resultado);
        double ln = Math.log(resultado);

        System.out.println("O calculo dos valores é:  " + resultado);
        System.out.printf("O calculo Exponencial dos valores: %.4f%n" , expo);
        System.out.printf("O calculo do Logaritmo Natural dos valores:  %.4f%n" , ln);

        sc.close();
    }
}
