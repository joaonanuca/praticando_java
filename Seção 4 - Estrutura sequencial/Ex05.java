package secao4;

import static java.lang.Math.pow;
import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio do circulo: ");
        double r = sc.nextDouble();
        double tt = 3.14159;
        
        double area = tt * (pow(r, 2));
        
        System.out.printf("A = %.4f", area);
        
    }
    
}
