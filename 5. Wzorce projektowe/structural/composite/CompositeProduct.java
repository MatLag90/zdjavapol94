package structural.composite;

import java.util.Arrays;

public class CompositeProduct implements Product {
    private Product[] products;

    public CompositeProduct(Product... products) {
        this.products = products;
    }

    @Override
    public int getPrice() {
//        Wersja 1:
//        int sum = 0;
//        for (Product product : products) {
//            sum += product.getPrice();
//        }
//        return sum;
        // 10, 5, 8, 12

        // current: 0, next: 10 -> 10
        // current: 10, next: 5 -> 15
        // current: 15, next: 8  -> 23
        // current: 23, next: 12 -> 35


//        Wersja 2:
//        return Arrays.stream(products)
//                .map(Product::getPrice) // .map(product -> product.getPrice())
//                .reduce(0, (current, next) -> current + next);

//        Wersja 3:
        return Arrays.stream(products)
                .mapToInt(Product::getPrice)
                .sum();
    }
}
