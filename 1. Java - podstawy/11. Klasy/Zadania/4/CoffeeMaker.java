package classes.exercises.exercise_4;

// 4. Stwórz klasę CoffeeMaker (ekspres do kawy). W klasie mamy pola: manufacturer (producent),
// grindSize (stopień mielenia). W klasie mamy konstruktor ustawiający wartości pól zgodnie
// z wartościami parametrów.
// Klasa oferuje metodę makeCoffee, która niczego nie zwraca.
// Metoda wypisuje w konsoli tekst: Ekspres firmy ... mieli ziarna na grubość ... i parzy kawę.
public class CoffeeMaker {
    private String manufacturer;
    private int grindSize;

    public CoffeeMaker(String manufacturer, int grindSize) {
        this.manufacturer = manufacturer;
        this.grindSize = grindSize;
    }

    public void makeCoffee() {
        System.out.println("Ekspres firmy " + manufacturer + " mieli ziarna na grubość "
            + grindSize + " i parzy kawę.");
    }
}
