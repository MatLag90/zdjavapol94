package pl.sdacademy.comparison;

// Klasa Car implementuje interfejs Comparable w taki sposób,
// że obiekty klasy Car będzie można porównywać z obiektami klasy Car.
public class Car implements Comparable<Car> {
    private int speed;
    private String model;

    public Car(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }

    // Implementacja metody abstrakcyjnej interfejsu Comparable.
    // Jeden samochód będzie większy od drugiego, jeśli będzie od niego szybszy.
    @Override
    public int compareTo(Car car) {
        return speed - car.speed;
    }
}
