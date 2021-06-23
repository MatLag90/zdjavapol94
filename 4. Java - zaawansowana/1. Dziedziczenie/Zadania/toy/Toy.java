package pl.sdacademy.inheritance.exercises.toy;

// 1. Stwórz klasę Toy (zabawka). W klasie mamy pola price, minAge (od jakiego wieku nadaje się zabawka). Dodaj konstruktor, gettery.
public class Toy {
    private int price;
    private int minAge;

    public Toy(int price, int minAge) {
        this.price = price;
        this.minAge = minAge;
    }

    public int getPrice() {
        return price;
    }

    public int getMinAge() {
        return minAge;
    }
}
