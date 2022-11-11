package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author joaon
 */
public class Program {

    public static void main(String[] args) {

        String lines[] = new String[]{"Good Morning", "Good Afternoon", "Good Night"};

        String path = "C:\\Users\\joaon\\Documents\\NetBeansProjects\\Ex027\\dir\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
