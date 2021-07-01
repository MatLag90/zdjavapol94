package pl.sdacademy.structural.bridge;

public class Circle extends Shape {
    private double r;

    public Circle(Color color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
