package secao6;

import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.println("Digite o valor de Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }
            if (x != 0 && y != 0) {
                System.out.println("Digite o valor de X: ");
                x = sc.nextInt();
                System.out.println("Digite o valor de Y: ");
                y = sc.nextInt();
            }
        }

        System.out.println("Encerrado!");

    }

}
