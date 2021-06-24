package pl.sdacademy.exercises.geometry;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------- Zadanie 1, 2 -------");
        Shape shape1 = new Rectangle("biały", 3, 4);
        System.out.println("Pole powierzchni figury 1 (prostokąta): " + shape1.getArea());
        System.out.println("Obwód figury 1 (prostokąta): " + shape1.getPerimeter());
        System.out.println("\n-------- Zadanie 4 -------");

        Shape shape2 = new Square("niebieski", 5);
        System.out.println("Pole powierzchni figury 2 (kwadratu): " + shape2.getArea());
        System.out.println("Obwód figury 1 (kwadratu): " + shape2.getPerimeter());
    }
}
