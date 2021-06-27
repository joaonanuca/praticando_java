package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author João Nanuca
 */
public class MainEx01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.println("Digite o nome do produto: ");
        p.name = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        p.price = sc.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        p.quantity = sc.nextInt();
        
        p.showProduct();
        
        System.out.println("Digite a quantidade que deseja dar entrada no estoque: ");
        p.addProducts(sc.nextInt());
        
        p.showProduct();
        
        System.out.println("Digite a quantidade que deseja dar baixa no estoque: ");
        p.removeProducts(sc.nextInt());
        
        p.showProduct();

    }

}
