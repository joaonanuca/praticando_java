package util;

/**
 *
 * @author João Nanuca
 */
public class CurrencyConverter {
    
    public static Double converter(Double price, Double quantity){
        Double dollars = price * quantity;
        return dollars + (dollars * 0.06);
    }
    
}
