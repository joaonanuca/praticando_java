package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author joaon
 */
public class Program {

    public static void main(String[] args) {

        String path = "C:\\Users\\joaon\\Documents\\Estudos\\Java Orieentado a Objetos\\Seção 17 - Trabalhando com Arquivos\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } 
    }
}
