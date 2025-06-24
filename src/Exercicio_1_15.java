import java.util.Scanner;

public class Exercicio_1_15 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite  a cotação de um dólar em reais: R$ ");
        double dollar = sc.nextDouble();

        System.out.println("Digite a quantidade de dólares: $ ");
        double quantidade = sc.nextDouble();

        double reais = dollar * quantidade;
        System.out.printf("O valor correspondente em reais é: R$ %.2f%n", reais);

        sc.close();
    }
}
