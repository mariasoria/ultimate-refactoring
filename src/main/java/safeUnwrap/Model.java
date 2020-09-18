package safeUnwrap;

public class Model {
    private String Color;
    private int Amount;

    public Model(String color, int amount) {
        Color = color;
        Amount = amount;
    }

    public String getColor() {
        return Color;
    }

    public int getAmount() {
        return Amount;
    }
}
