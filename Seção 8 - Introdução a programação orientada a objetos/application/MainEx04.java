package application;

import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class MainEx04 {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Aluno a = new Aluno();
        
        System.out.println("Digite o nomed do aluno: ");
        a.name = sc.nextLine();
        
        System.out.print("Digite a primeira nota: ");
        a.note1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        a.note2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        a.note3 = sc.nextDouble();
        
        System.out.printf("FINAL GRADE = %.2f", a.finalNote());
        System.out.println();
        a.result(a.finalNote());
    }
    
}
