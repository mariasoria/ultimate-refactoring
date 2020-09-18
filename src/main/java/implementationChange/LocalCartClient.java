package implementationChange;


public class LocalCartClient {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Price(10));
        System.out.println("shoppingCart.numberOfProducts() = " + shoppingCart.numberOfProducts());
        // return prices.stream().mapToInt(price -> price).sum(); // tambien vale
        System.out.println("shoppingCart.calculateTotalPrice() = " + shoppingCart.calculateTotalPrice().getPrice());
        System.out.println("shoppingCart.hasDiscount() = " + shoppingCart.hasDiscount());
    }

}
