package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author joaon
 */
public class Installment {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dueDate;
    private Double amount;

    public Installment() {
    }

    public Installment(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format((this.dueDate != null ? sdf.format(this.dueDate) : null) + " - %.2f", amount);
    }

}
