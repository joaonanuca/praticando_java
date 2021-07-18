package application;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex02 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
                
        System.out.println("Enter rectangle width and height: ");
        r.width = sc.nextDouble();
        r.height = sc.nextDouble();
        
        System.out.printf("AREA = %.2f \n", r.area());
        System.out.printf("PERIMETER = %.2f \n", r.perimeter());
        System.out.printf("DIAGONAL = %.2f \n", r.diagonal());
    }
    
}
