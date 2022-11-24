package model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import model.entities.Contract;
import model.entities.Installment;

/**
 *
 * @author joaon
 */
public class ContractService {

    public void processContract(Contract contract, Integer months) {
        ArrayList<Installment> listInstallments = new ArrayList<>();

        OnlinePaymentService ps = new PaypalService();

        Double installmentValue = (contract.getTotalValue() / months);

        for (int i = 1; i <= months; i++) {
            Installment installment = new Installment();
            Calendar cal = Calendar.getInstance();
            cal.setTime(contract.getDate());

            Double installValue = installmentValue + ps.interest(installmentValue, i);
            installValue += ps.paymentFee(installValue);
            cal.add(Calendar.MONTH, i);

            installment.setDueDate(new Date(cal.getTimeInMillis()));
            installment.setAmount(installValue);

            listInstallments.add(installment);
        }

        contract.setInstallments(listInstallments);

    }

}
