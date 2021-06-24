package pl.sdacademy.exercises.geometry;

//  2. (geom) Tworzymy klasę Rectangle o dwóch polach typu int
//  (reprezentujące długości boków), która będzie rozszerzała klasę Shape.
public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}
