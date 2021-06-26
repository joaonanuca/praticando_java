package secao6;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex21 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <=n; i++){
            
            System.out.println(i + " - " + pow(i,2) + " - " + pow(i,3));
            
        }
        
    }
    
}
