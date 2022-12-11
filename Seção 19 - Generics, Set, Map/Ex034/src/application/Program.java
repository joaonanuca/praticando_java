package application;

import java.util.Locale;
import java.util.Scanner;
import services.PrintService;

/**
 *
 * @author joaon
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            ps.addValue(sc.nextInt());
        }

        ps.print();
        System.out.println("\nFirst Value: " + ps.firstValue());

    }

}
