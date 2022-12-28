package application;

import entities.Candidate;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Developer
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path:");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map<Candidate, Integer> candidates = new LinkedHashMap<>();
            String line = br.readLine();

            while (line != null) {
                String[] values = line.split(",");
                Candidate c = new Candidate(values[0], Integer.parseInt(values[1]));

                if (candidates.containsKey(c)) {
                    Integer votes = candidates.get(c) + Integer.parseInt(values[1]);
                    c.setVotes(votes);
                    candidates.put(c, votes);
                } else {
                    candidates.put(c, Integer.parseInt(values[1]));
                }

                line = br.readLine();
            }

            for (Candidate c : candidates.keySet()) {
                System.out.println(c.getName() + ": " + candidates.get(c));
            }
        } catch (Exception ex) {
            ex.getMessage();
            ex.printStackTrace();
        }
        System.out.println("rodou");
        sc.close();
    }

}
