package secao4;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o código da primeira peça: ");
        int pri_cod = sc.nextInt();
        
        System.out.println("Digite a quantidade de itens da primeira peça: ");
        int pri_qtd = sc.nextInt();
        
        System.out.println("Digite o valor unitário da primeiro peça: ");
        double pri_valor = sc.nextDouble();
        
        System.out.println("Digite o código da segunda peça: ");
        int sec_cod = sc.nextInt();
        
        System.out.println("Digite a quantidade de itens da segunda peça: ");
        int sec_qtd = sc.nextInt();
        
        System.out.println("Digite o valor unitário da segunda peça: ");
        double sec_valor = sc.nextDouble();
        
        System.out.printf("VALOR A PAGAR = %.2f", ((pri_qtd * pri_valor) + (sec_qtd * sec_valor)));
        
    }
    
}
