package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class MainEx06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account a = null;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        double value;

        System.out.print("Is there na initial deposit (y/n)? ");
        if (sc.next().equals("y")) {

            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();

            a = new Account(number, name, value);
        } else {
            a = new Account(number, name);
        }

        System.out.println("Account data: \n" + a.toString());

        System.out.print("Enter a deposit value: ");
        a.deposit(sc.nextDouble());
        System.out.println("Updated account data: \n" + a.toString());

        System.out.print("Enter a withdarw value: ");
        a.withdraw(sc.nextDouble());
        System.out.println("Updated account data: \n" + a.toString());

        sc.close();

    }

}
