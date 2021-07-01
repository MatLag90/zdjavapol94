package pl.sdacademy.creational.prototype;

public class Car implements Cloneable {
    private int speed;
    private String model;

    public Car(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public Car(Car car) {
        speed = car.speed;
        model = car.model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
