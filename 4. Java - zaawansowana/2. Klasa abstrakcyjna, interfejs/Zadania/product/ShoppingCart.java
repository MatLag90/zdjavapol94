package pl.sdacademy.exercises.product;

//12. (prod) Stwórz klasę ShoppingCart, który reprezentuje koszyk z zakupami.
// Niech klasa posiada pole - tablicę produktów oraz metodę getTotalPrice,
// która zwróci łączną cenę produktów.
public class ShoppingCart {
    private Product[] products;

    public ShoppingCart(Product... products) {
        this.products = products;
    }

    public double getTotalPrice() {
        double result = 0;
        for (Product product : products) {
            result += product.getPrice();
        }
        return result;
    }
}
