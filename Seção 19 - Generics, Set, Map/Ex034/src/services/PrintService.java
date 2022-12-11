package services;

import java.util.ArrayList;

/**
 *
 * @author joaon
 */
public class PrintService<T> {

    ArrayList<T> values = new ArrayList<>();

    public PrintService() {
    }

    public ArrayList<T> getValues() {
        return values;
    }

    public void addValue(T value) {
        this.values.add(value);
    }

    public T firstValue() {
        if (values.isEmpty()) {
            throw new IllegalStateException("List Empty!");
        }
        return this.values.get(0);
    }

    public void print() {
        System.out.print("[");
        for (T v : values) {
            if (v.equals(values.get(0))) {
                System.out.print(v);
            } else {
                System.out.print("," + v);
            }
        }
        System.out.print("]");
    }

}
