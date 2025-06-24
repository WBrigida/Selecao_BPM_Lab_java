import java.util.Scanner;

public class Exercicio_1_12 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da resistência: ");
        double resistencia = sc.nextDouble();

        System.out.println("Digite o valor da corrente elétrica: ");
        double corrente = sc.nextDouble();

        double tensao = corrente * resistencia;
        System.out.println("Tensão = " + tensao + " volts.");

        sc.close();

    }
}
