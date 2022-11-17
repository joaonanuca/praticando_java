package application;

import entities.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaon
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        File f = new File("summary.csv");

        FileReader fr;
        try {
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            Product p = null;

            //Cria a subpasta
            boolean sucess = new File("out").mkdir();

            String path = "C:\\Users\\joaon\\Documents\\NetBeansProjects\\Ex030\\out\\summary.csv";

            //Cria o novo arquivo na subpasta
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))) {
                //Ler as linhas dos arquivos
                String line = br.readLine();

                //Escreve as linhas no novo arquivo com os dados do primeiro
                while (line != null) {
                    p = new Product(line.split(",")[0], new BigDecimal(line.split(",")[1].trim()), new BigDecimal(line.split(",")[2].trim()));

                    //Escreve a primeira linha
                    bw.write(p.toString());
                    //Passa para a próxima linha
                    bw.newLine();

                    line = br.readLine();
                }

            } catch (IOException ex) {
                Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                BufferedReader b = new BufferedReader(new FileReader("C:\\Users\\joaon\\Documents\\NetBeansProjects\\Ex030\\out\\summary.csv"));

                String l = b.readLine();

                while (l != null) {
                    System.out.println(l);
                    l = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
