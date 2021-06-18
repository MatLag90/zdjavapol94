package classes.exercises.exersices_1_2;

// 1. Stwórz klasę Rectangle, która będzie miała pola: a, b (długości boków).
// Do klasy dodaj konstruktor (ustawiający wartości wszystkich pól) oraz gettery.
// 1b. Dodaj do klasy metodę getArea, która zwróci pole powierzchni, oraz metodę
// getPerimeter zwracającą obwód figury.
public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getArea() {
        return a * b;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }
}
