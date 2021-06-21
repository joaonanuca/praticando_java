package secao4;

import static java.lang.Math.pow;
import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        double a = sc.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        double b = sc.nextDouble();
        
        System.out.println("Digite o valor de C: ");
        double c = sc.nextDouble();
        
        System.out.printf("TRIANGULO: %.3f \n", ((a*c)/2));
        double pi = 3.14159;
        System.out.printf("CIRCULO: %.3f \n", (pi * (pow(c, 2))));
        System.out.printf("TRAPEZIO: %.3f \n", (((a+b) * c) / 2));
        System.out.printf("QUADRADO: %.3f \n", (pow(b, 2)));
        System.out.printf("RETANGULO: %.3f \n", (a * b));
    }
    
}
