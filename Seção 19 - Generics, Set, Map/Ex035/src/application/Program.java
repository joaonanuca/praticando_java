package application;

import entities.LogEntry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author joaon
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> entrys = new HashSet<>();

            String line = br.readLine();

            while (line != null) {
                entrys.add(new LogEntry(line.split(" ")[0], Date.from(Instant.parse(line.split(" ")[1]))));
                line = br.readLine();
            }

            System.out.println("Total users: " + entrys.size());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }

}
