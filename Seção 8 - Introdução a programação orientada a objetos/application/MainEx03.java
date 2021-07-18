package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class MainEx03 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Employee e = new Employee();
        
        System.out.print("Name: ");
        e.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        e.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        e.tax = sc.nextDouble();
        
        System.out.println("Employee: " + e.toString());
        
        System.out.print("Which percentage to increase salary?");
        e.increaseSalary(sc.nextDouble());
        
        System.out.println("Updated data: " + e.toString());
        
    }
    
}
