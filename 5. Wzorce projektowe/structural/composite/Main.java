package structural.composite;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread();
        Cheese cheese = new Cheese();

        CompositeProduct compositeProduct1 = new CompositeProduct(bread, cheese);
        System.out.println(compositeProduct1.getPrice());

        CompositeProduct compositeProduct2 = new CompositeProduct(
                compositeProduct1,
                new Bread(),
                new Bread(),
                new Cheese());
        System.out.println(compositeProduct2.getPrice());
    }
}
