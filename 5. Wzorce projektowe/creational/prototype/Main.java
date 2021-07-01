package pl.sdacademy.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car(100, "Ford Fiesta");
        Car clone1 = car.clone();
        System.out.println(clone1);
        System.out.println("Czy mamy utworzone dwa różne obiekty? " + (car == clone1));

        Car clone2 = new Car(car);
        System.out.println(clone2);
    }
}
