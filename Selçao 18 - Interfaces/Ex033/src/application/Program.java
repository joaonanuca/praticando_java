package application;

import entities.Employee;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author joaon
 */
public class Program {

    public static void main(String[] args) {

        ArrayList<Employee> nomes = new ArrayList<>();
        String path = "in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employee = br.readLine();

            while (employee != null) {
                String fields[] = employee.split(",");
                nomes.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employee = br.readLine();
            }

            Collections.sort(nomes);

            System.out.println("");
            for (Employee n : nomes) {
                System.out.println(n.getName() + " - " + n.getSalary());
            }

        } catch (Exception ex) {

        }

    }

}
