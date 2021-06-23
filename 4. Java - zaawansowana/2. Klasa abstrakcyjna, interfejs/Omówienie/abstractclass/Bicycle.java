package pl.sdacademy.abstractclass;

// Analogia do klasy Car - podejrzyj komentarze w klasie Car.
public class Bicycle extends Vehicle {
    public Bicycle(int speed, int maxSpeed) {
        super(speed, maxSpeed);
    }

    @Override
    public void repair() {
        System.out.println("Naprawiam rower - sprawdzam kierownicę, łańcuch itd.");
    }
}
