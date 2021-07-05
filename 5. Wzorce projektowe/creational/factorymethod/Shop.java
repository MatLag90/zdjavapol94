package creational.factorymethod;

public class Shop {
    private Manufacturer manufacturer;

    public Shop(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Product buyProduct() {
        System.out.println("Kupno produktu");
        return manufacturer.create();
    }
}
