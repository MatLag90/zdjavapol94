package pl.sdacademy.structural.bridge;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public Color getColor() {
        return color;
    }
}

// A
