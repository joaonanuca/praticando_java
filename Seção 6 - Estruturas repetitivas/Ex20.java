package secao6;

import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex20 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    
}
