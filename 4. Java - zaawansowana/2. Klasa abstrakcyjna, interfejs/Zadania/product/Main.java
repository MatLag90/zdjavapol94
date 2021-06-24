package pl.sdacademy.exercises.product;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ Zadanie 5, 6 -----");
        Product product1 = new ChocolateBar(5, 2);
        System.out.println(product1);
        System.out.println("Cena produktu 1 (batonika): " + product1.getPrice());
        System.out.println("Waga produktu 1 (batonika): " + product1.getWeight());

        System.out.println("\n------ Zadanie 7 -----");
        Product product2 = new Milk(1, 0.9, 123);
        System.out.println(product2);
        System.out.println("Cena produktu 2 (mleka): " + product2.getPrice());
        System.out.println("Waga produktu 2 (mleka): " + product2.getWeight());

        System.out.println("\n------ Zadanie 12 -----");
        ShoppingCart shoppingCart = new ShoppingCart(product1, product2);
        System.out.println("Łączna cena produktów w koszyku: " + shoppingCart.getTotalPrice());
    }
}
