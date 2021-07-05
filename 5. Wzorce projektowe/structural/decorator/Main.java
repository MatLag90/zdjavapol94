package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Product product = new Bread();
        DiscountedProduct discountedProduct = new DiscountedProduct(product, 1);
        System.out.println(discountedProduct.getDiscountedPrice());
        System.out.println(discountedProduct.getPrice());
    }
}
