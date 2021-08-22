package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex011 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int m = sc.nextInt();

        System.out.print("Digite o número de colunas: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int cont = 0;

        System.out.print("Digite o número que deseja encontrar na matriz: ");
        int num = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == num) {
                    cont++;
                }
            }
        }

        if (cont > 0) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matriz[i][j] == num) {
                        System.out.println("Position: " + i + ", " + j);
                        int x = i;
                        int y = j;

                        if ((y - 1 < n) && (y - 1 >=0)) {
                            System.out.println("Left: " + matriz[x][y -1]);
                        }
                        if((y + 1 < n) && (y + 1 > y)){
                            System.out.println("Right: " + matriz[x][y + 1]);
                        }
                        if((x - 1 < m) && (x - 1 >=0)){
                            System.out.println("Top: " + matriz[x - 1][y]);
                        }
                        if((x + 1 < m) && (x + 1 > x)){
                            System.out.println("Down: " + matriz[x + 1][y]);
                        }
                    }
                }
            }
        } else {
            System.out.println("\nO número não se encontra na matriz!");
        }
    }

}
