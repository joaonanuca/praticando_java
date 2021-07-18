package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

/**
 *
 * @author João Nanuca
 */
public class MainEx05 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the dollar price?");
        Double price = sc.nextDouble();
        
        System.out.print("How many dollars will be bought?");
        Double dollars = sc.nextDouble();
        
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(price, dollars));
        
        sc.close();
    }
    
}
