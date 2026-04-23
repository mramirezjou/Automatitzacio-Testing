package cat.inspla.ra3;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Double> prices = new ArrayList<>();

    public void addItem(String name, double price) {
        prices.add(price);
    }

    public double getTotal() {
        return prices.stream().mapToDouble(Double::doubleValue).sum();
    }

    public int getItemCount() {
        return prices.size();
    }

    public void clear() {
        prices.clear();
    }
}
