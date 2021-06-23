package pl.sdacademy.inheritance.exercises.vehicle;

// 3. Stworzyć klasę Vehicle, która będzie miała pola speed (aktualna prędkość)
// oraz maxSpeed (prędkość maksymalna) typu int, konstruktor ustawiający wartość
// tych pól oraz gettery.
public class Vehicle {
    private int speed;
    private int maxSpeed;

    public Vehicle(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

//  5. W klasie Vehicle nadpisz metodę toString odziedziczoną
//  z klasy Object w taki sposób, aby jej wynik opisywał wartości
//  wszystkich pól.
    @Override
    public String toString() {
        return "prędkość: " + speed + ", prędkość maksymalna: " + maxSpeed;
    }
}
