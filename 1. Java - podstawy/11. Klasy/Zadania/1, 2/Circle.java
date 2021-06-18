package classes.exercises.exersices_1_2;

public class Circle {
    // promień
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
