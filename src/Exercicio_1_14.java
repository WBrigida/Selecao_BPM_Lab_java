import java.util.Scanner;

public class Exercicio_1_14 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial: ");
        double velocidade = sc.nextDouble();

        System.out.println("Digite o valor da aceleração: ");
        double acelercao = sc.nextDouble();

        System.out.println("Digite o valor do tempo de percurso: ");
        double tempo = sc.nextDouble();

        double velocidadeFinal =  velocidade + (tempo * acelercao);
        double velocidadeKm = velocidadeFinal * 3.6;

        System.out.printf("A velocidade final do automóvel é: %.2f km/h%n", velocidadeKm);

        sc.close();
    }
}
