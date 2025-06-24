import java.util.Scanner;

public class Exercicio_1_11 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em milhas que deseja converter para km/h:");
        double milhas = sc.nextDouble();

        double km = milhas * 1.6;

        System.out.println("O valor em km/h é de : " + km + " km/h");

        sc.close();
    }
}
