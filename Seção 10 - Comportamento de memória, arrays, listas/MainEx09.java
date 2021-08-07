package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class MainEx09 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployee = new ArrayList<>();
        Employee e;

        System.out.print("How many emplyees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Employee #" + (i + 1));
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            e = new Employee(id, name, salary);
            listEmployee.add(e);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        if (searchId(id, listEmployee)) {
            for (int i = 0; i < listEmployee.size(); i++) {
                if (id == listEmployee.get(i).getId()) {
                    System.out.print("Enter the percentage: ");
                    double percentage = sc.nextDouble();

                    listEmployee.get(i).increaseSalary(percentage);
                }
            }
        }else{
            System.out.println("The id does not exist!");
        }

        System.out.println("\nList of employees");
        for (Employee em : listEmployee) {
            System.out.println(em.toString());
        }

    }

    public static boolean searchId(int id, List<Employee> listEmployee) {

        for (int i = 0; i < listEmployee.size(); i++) {
            if (id == listEmployee.get(i).getId()) {
                return true;
            }
        }
        return false;
    }

}
