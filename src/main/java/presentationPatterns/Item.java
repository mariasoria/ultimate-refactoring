package presentationPatterns;

import java.math.BigDecimal;

public class Item {
    private final String name;
    private final String description;
    private final BigDecimal price;

    public Item(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
