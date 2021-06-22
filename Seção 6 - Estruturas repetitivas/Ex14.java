package secao6;

import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0, n;

        System.out.println("1.Álcool");
        System.out.println("2.Gasolina");
        System.out.println("3.Diesel");
        System.out.println("4.Fim");

        System.out.println("Digite a sua prefeência de gasolina:");
        n = sc.nextInt();

        while (n != 4) {

            System.out.println("1.Álcool");
            System.out.println("2.Gasolina");
            System.out.println("3.Diesel");
            System.out.println("4.Fim");

            switch (n) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    System.out.println("Valor Inválido!");
                    break;

            }

            System.out.println("Digite a sua preferência de gasolina:");
            n = sc.nextInt();

        }

        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }

}
