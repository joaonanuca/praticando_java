package entities;

import java.math.BigDecimal;

/**
 *
 * @author joaon
 */
public class Product {

    private String description;
    private BigDecimal value;
    private BigDecimal quantity;

    public Product() {
    }

    public Product(String description, BigDecimal value, BigDecimal quantity) {
        this.description = description;
        this.value = value;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format(description + ", %.2f", value.multiply(quantity));
    }

}
