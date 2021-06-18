package classes.methods;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------- car1 ----------");
        Car car1 = new Car("Ford Mondeo", 123);
        // Metody wywołujemy w przykładach w kontekście konkretnego obiektu - samochodu przypisanego do zmiennej car1.
        // (analogia do metod np. charAt lub length obiektów typu String).
        System.out.println("Model samochodu: " + car1.getModel());
        System.out.println("Prędkość samochodu: " + car1.getSpeed());
        System.out.println("Ustawiamy prędkość na 50");
        car1.setSpeed(50);
        System.out.println("Prędkość samochodu: " + car1.getSpeed());
        System.out.println("Przyspieszamy samochód (wywołanie metody accelerate)");
        car1.accelerate();
        System.out.println("Prędkość samochodu: " + car1.getSpeed());

        System.out.println("\n----------- car2 ----------");
        Car car2 = new Car("Citroen C3", 30);
        System.out.println("Prędkość samochodu: " + car2.getSpeed());
    }
}
