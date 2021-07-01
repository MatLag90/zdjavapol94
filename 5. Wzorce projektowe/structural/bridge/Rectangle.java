package pl.sdacademy.structural.bridge;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(Color color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
