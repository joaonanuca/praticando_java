package secao4;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número do funcionário: ");
        int num = sc.nextInt();
        
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horas = sc.nextInt();
        
        System.out.println("Digite o valor da hora de trabalho: ");
        double valor = sc.nextDouble();
        
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f", (horas * valor));
    }
    
}
