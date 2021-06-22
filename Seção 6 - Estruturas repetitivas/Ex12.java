package secao6;

import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = sc.nextLine();

        while (!senha.equals("2002")) {
            if (!senha.equals("2002")) {
                System.out.println("Senha Inválida!");
                senha = sc.nextLine();
            }
        }

        System.out.println("Acesso permitido!");

    }

}
