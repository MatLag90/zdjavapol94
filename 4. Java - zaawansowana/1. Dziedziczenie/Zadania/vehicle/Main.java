package pl.sdacademy.inheritance.exercises.vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Zadanie 3 ----------");
        Vehicle vehicle1 = new Vehicle(10, 20);
        System.out.println("Prędkość pojazdu: " + vehicle1.getSpeed());
        System.out.println("Prędkość maksymalna pojazdu: " + vehicle1.getMaxSpeed());

        System.out.println("\n--------- Zadanie 4 ----------");
        Car car1 = new Car(40, 190, false);
        System.out.println("Prędkość samochodu: " + car1.getSpeed());
        System.out.println("Prędkość maksymalna samochodu: " + car1.getMaxSpeed());
        System.out.println("Czy samochód jest kabrioletem: " + car1.isConvertible());

        System.out.println("\n--------- Zadanie 5 ----------");
        System.out.println(vehicle1);

        System.out.println("\n--------- Zadanie 6 ----------");
        System.out.println(car1);
    }
}
