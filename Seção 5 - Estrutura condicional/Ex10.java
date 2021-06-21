package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de X: ");
        double x = sc.nextDouble();
        
        System.out.println("Digite o valor de Y: ");
        double y = sc.nextDouble();
        
        if(x > 0.0 && y > 0.0){
            System.out.println("O ponto está no quadrante Q1!");
        }else if (x < 0.0 && y > 0.0){
            System.out.println("O ponto está no quadrante Q2!");
        }else if(x < 0.0 && y < 0.0){
            System.out.println("O ponto está no quadrante Q3!");
        }else if(x > 0.0 && y < 0.0){
            System.out.println("O ponto está no quadrante Q4!");
        }else {
            System.out.println("O ponto está na origem!");
        }
        
        
    }
    
}
