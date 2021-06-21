package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Ex011 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dgite o valor do salário: ");
        double salario = sc.nextDouble();
        double imposto = 0;
        
        if(salario > 0.0 && salario <= 2000.0){
            System.out.println("Isento");
        }else if(salario > 2000.0 && salario <=3000.0){
            imposto = (1000*0.08);
            System.out.println(imposto);
        }else if(salario > 3000.0 && salario <= 4500){
            imposto = (1000*0.08) + ((salario - 3000) * 0.18);
            System.out.println(imposto);
        }else if(salario > 4500){
            imposto = (1000*0.08) + (1500*0.18) + ((salario - 4500) * 0.28);
            System.out.println(imposto);
        }else if(salario <=0){
            System.out.println("Salário Inválido!");
        }
        
    }
    
}
