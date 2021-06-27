package entities;

/**
 *
 * @author João Nanuca
 */
public class Product {
    
    public String name;
    public double price;
    public int quantity;
    
    public double totalValueInStock(){
        return price * quantity;
    }
    
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    
    public void showProduct(){
        System.out.println("Produto: " + name);
        System.out.println("Preço: " + price);
        System.out.println("Quantidade: " +quantity);
        System.out.printf("Valor total no estoque: %.2f", totalValueInStock());
        System.out.println("\n");
    }
    
}
