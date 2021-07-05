package creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop(new ShoeMaker());
        System.out.println(shop.buyProduct());
    }
}
