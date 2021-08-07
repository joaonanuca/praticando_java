package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class MainEx08 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student vect[] = new Student[9];
        Student s;

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("\nRent #" + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            s = new Student(name, email);

            if (vect[room] == null) {
                vect[room] = s;
            } else {
                System.out.println("the room is occupied!");
                System.out.print("Room: ");
                room = sc.nextInt();
                vect[room] = s;
            }

        }

        System.out.println("\nBusy rooms:");

        for (int i = 0; i < 9; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i].toString());
            }

        }

        sc.close();
    }

}
