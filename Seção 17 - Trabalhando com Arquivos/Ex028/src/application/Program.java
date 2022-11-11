package application;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] paths = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS:");
        for (File folder : paths) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\subDir").mkdir();
        System.out.println("Create subDir sucefully: " + sucess);

    }

}
