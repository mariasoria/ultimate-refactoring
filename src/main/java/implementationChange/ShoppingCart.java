package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Price> prices = new ArrayList<Price>();

    public void add(Price price) {
        prices.add(price);
    }

    public Price calculateTotalPrice() {
        return new Price(prices.stream().mapToInt(Price ::getPrice).sum());
    }

    public boolean hasDiscount() {
        return calculateTotalPrice().getPrice() >= 100;
    }

    public int numberOfProducts() {
        return prices.size();
    }
}
