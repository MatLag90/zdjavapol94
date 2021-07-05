package structural.adapter;

public class GermanShepherd implements Dog {
    @Override
    public void run() {
        System.out.println("Owczarek niemiecki biegnie");
    }

    @Override
    public void bark() {
        System.out.println("Owczarek niemiecki szczeka");
    }
}
