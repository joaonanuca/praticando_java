package secao6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex17 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            float n1 = sc.nextFloat();
            float n2 = sc.nextFloat();
            float n3 = sc.nextFloat();
            float media = (((n1*2) + (n2*3) + (n3*5)) / (2+3+5));
            System.out.printf("Média: %.1f%n", media);
        }
    }
    
}
