package pl.sdacademy.exercises.product;

//7. (prod) Stwórz klasę Milk, która reprezentuje mleko.
// Mleko ma pola: objętość, gęstość, oraz cena za kilogram.
// Niech mleko także będzie produktem.
public class Milk implements Product {
    // W metrach^3
    private double volume;
    // W kg/m^3
    private double density;
    private double pricePerKg;

    public Milk(double volume, double density, double pricePerKg) {
        this.volume = volume;
        this.density = density;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public double getPrice() {
        return getWeight() * pricePerKg;
    }

    @Override
    public double getWeight() {
        return volume * density;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "volume=" + volume +
                ", density=" + density +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}
