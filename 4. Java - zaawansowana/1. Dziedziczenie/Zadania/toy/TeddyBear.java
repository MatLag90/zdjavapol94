package pl.sdacademy.inheritance.exercises.toy;

// 2. Utwórz klasę TeddyBear (miś), która rozszerza klasę Toy.
// Klasa posiada dodatkowo pole name (imię). Dodaj getter dla pola.
// Utwórz obiekt klasy TeddyBear, następnie wypisz w konsoli wartości
// jego pól z wykorzystaniem getterów (również tych odziedziczonych).
// Przypisz następnie tego misia do zmiennej typu Toy.
// Spróbuj wywołać te same gettery - przeanalizuj, które możemy wywołać,
// a których nie (i dlaczego tak jest).
public class TeddyBear extends Toy {
    private String name;

    public TeddyBear(int price, int minAge, String name) {
        super(price, minAge);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
