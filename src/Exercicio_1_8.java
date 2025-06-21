import java.util.Scanner;

public class Exercicio_1_8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double r, a;
        double volumeEsfera, volumeCubo, volumeLivre;
        double PI = (double) Math.PI;

        System.out.println("Digite o valor do raio da esfera: ");
        r = sc.nextDouble();
        System.out.println("Digite o valor da arrseta do cubo");
        a = sc.nextDouble();

        volumeEsfera = 4 * PI * r * r * r / 3;
        volumeCubo = a * a * a;
        volumeLivre = volumeCubo - volumeEsfera;

        System.out.println("O volume livre é " + volumeLivre);

        sc.close();
    }
}
