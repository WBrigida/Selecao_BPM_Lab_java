import java.util.Scanner;

public class Exercicio_1_18 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite  o valor de cinco produtos: R$ ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();

        double soma = a + b + c + d + e;
        System.out.printf("Valor total: R$ %.2f%n" , soma);

        System.out.print("Digite o valor do pagamento: R$ ");
        double pagar = sc.nextDouble();

        double troco = pagar - soma;
        System.out.printf("O seu troco é de: R$ %.2f%n" , troco);

        sc.close();
    }
}
