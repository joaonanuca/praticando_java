package secao6;

import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex19 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        int fat = 1;
        for(int i = 1; i<=n; i++){
            if(n!=0)
                fat = fat * i;
            else
                System.out.println("O fatorial de " +n+ " é: 1");
        }
        
        System.out.println("O fatorial de " +n+ " é: " + fat);
    }
    
}
