package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;

/**
 *
 * @author joaon
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        Integer numero = sc.nextInt();

        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        Date data = sdf.parse(sc.nextLine());

        System.out.print("Valor do contrato: ");
        Double valor = sc.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        Integer numeroParcelas = sc.nextInt();

        Contract contract = new Contract(numero, data, valor);

        ContractService cs = new ContractService();
        cs.processContract(contract, numeroParcelas);

        System.out.println("Parcelas:");
        for (Installment i : contract.getInstallments()) {
            System.out.println(i.toString());
        }

        sc.close();
    }
}
