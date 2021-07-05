package creational.factorymethod;

public class ShoeMaker implements Manufacturer {
    @Override
    public Product create() {
        return new Shoes();
    }
}
