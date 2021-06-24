package pl.sdacademy.exercises.product;

//  6. (prod) Stwórz klasę ChocolateBar, która będzie reprezentowała batonik.
//  Batonik ma pola cena i waga. Niech batonik będzie produktem (implementuje
//  interfejs Product).
public class ChocolateBar implements Product {
    private int price;
    private int weight;

    public ChocolateBar(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ChocolateBar{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
}
