package structural.decorator;

public class DiscountedProduct implements Product {
    private Product product;
    private int discount;

    public DiscountedProduct(Product product, int discount) {
        this.product = product;
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return product.getPrice();
    }

    public int getDiscountedPrice() {
        return getPrice() - discount;
    }
}
