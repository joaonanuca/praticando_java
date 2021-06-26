package secao6;

import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex18 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        
        for(int i = 0; i<n; i++){
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            
            if(b != 0){
                System.out.println(a/b);
            }else{
                System.out.println("Divisão impossivel!");
            }
        }
        
    }
    
}
