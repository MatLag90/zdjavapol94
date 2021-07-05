package creational.factorymethod;

public class Baker implements Manufacturer {
    @Override
    public Product create() {
        return new Bread();
    }
}
