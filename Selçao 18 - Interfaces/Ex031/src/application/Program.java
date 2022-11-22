package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

/**
 *
 * @author joaon
 */
public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
        
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        
        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();
        
        RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        
        rs.processInvoice(cr);
        
        System.out.println("FATURA:");
        System.out.println("PAGAMENTO BÁSICO: " + cr.getInvoice().getBasicPayment());
        System.out.println("IMPOSTO: " + cr.getInvoice().getTax());
        System.out.println("PAGAMENTO TOTAL: " + cr.getInvoice().getTotalPayment());
        
        sc.close();
    }
    
}
