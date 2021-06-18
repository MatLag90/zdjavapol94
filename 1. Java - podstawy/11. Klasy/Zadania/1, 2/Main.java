package classes.exercises.exersices_1_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------- Zadanie 1 ----------");
        Rectangle rectangle1 = new Rectangle(5, 12);
        System.out.println("Długość boku a: " + rectangle1.getA());
        System.out.println("Długość boku b: " + rectangle1.getB());
        System.out.println("Pole powierzchni: " + rectangle1.getArea());
        System.out.println("Obwód: " + rectangle1.getPerimeter());

        System.out.println("\n----------- Zadanie 2 ----------");
        Circle circle1 = new Circle(5.4);
        System.out.println("Promień: " + circle1.getR());
        System.out.println("Pole powierzchni: " + circle1.getArea());
        System.out.println("Obwód: " + circle1.getPerimeter());
    }
}
