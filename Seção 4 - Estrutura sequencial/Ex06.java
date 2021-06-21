package secao4;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();

        System.out.println("Digite o valor de C: ");
        int c = sc.nextInt();

        System.out.println("Digite o valor de d: ");
        int d = sc.nextInt();
        
        int dif = (a * b - c * d);
        
        System.out.println("DIFERENÇA = " + dif);
        
        

    }

}
