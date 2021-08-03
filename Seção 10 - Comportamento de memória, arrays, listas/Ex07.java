package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class Ex07 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de pessoas que deseja registrar a altura: ");
        int n = sc.nextInt();
        
        double[] height = new double[n];
        
        for(int i = 0; i < n; i++){
            System.out.print("Digite a altura da " + (i+1) + "ª pessoa: ");
            height[i] = sc.nextDouble();
        }
        
        double media = 0.0;
        
        for(int i = 0; i < height.length; i++){
            media += height[i];
        }
        
        media = media / height.length;
        
        System.out.printf("A média da altura das pessoas é: %.2f ", media);
        
        sc.close();
    }
    
}
