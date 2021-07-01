package pl.sdacademy.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(new Red(), 5);
        System.out.println(shape.getArea());
        System.out.println(shape.getColor().getName());
    }
}
