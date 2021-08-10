package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex010 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas e colunas da matriz: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor da linha " + i + " na coluna " + j + ":");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int cont = 0;

        System.out.println();
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
                if (matriz[i][j] < 0) {
                    cont += 1;
                }
            }
        }

        System.out.println();
        System.out.print("Quantidade de números negativos: " + cont);

        sc.close();

    }

}
