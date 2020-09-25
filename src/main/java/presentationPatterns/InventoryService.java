package presentationPatterns;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private final List<Item> items = new ArrayList<>();

    public void addProduct(String name, String description, String aPrice){
        BigDecimal price = BigDecimal.valueOf(Long.parseLong(aPrice));
        if (price.compareTo(BigDecimal.valueOf(0)) < 1){
            throw new RuntimeException("Can't add item with zero price");
        }
        items.add(new Item(name, description, price));
    }
}
