package secao6;

import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex16 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        int in = 0, out = 0;
        
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in++;
            }else{
                out++;
            }
        }
        
        System.out.println(in + " in \n" + out + " out");
        
    }
    
}
