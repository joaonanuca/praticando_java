package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Program {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\joaon\\Documents\\Estudos\\Java Orieentado a Objetos\\Seção 17 - Trabalhando com Arquivos\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

}
