package pl.sdacademy.inheritance.exercises.toy;

// 2. Utwórz klasę TeddyBear (miś), która rozszerza klasę Toy.
// Klasa posiada dodatkowo pole name (imię). Dodaj getter dla pola.
// Utwórz obiekt klasy TeddyBear, następnie wypisz w konsoli wartości
// jego pól z wykorzystaniem getterów (również tych odziedziczonych).
// Przypisz następnie tego misia do zmiennej typu Toy.
// Spróbuj wywołać te same gettery - przeanalizuj, które możemy wywołać,
// a których nie (i dlaczego tak jest).
public class Main {
    public static void main(String[] args) {
        TeddyBear teddyBear1 = new TeddyBear(50, 3, "Stefan");
        System.out.println("Imię: " + teddyBear1.getName());
        System.out.println("Cena: " + teddyBear1.getPrice());
        System.out.println("Minimalny wiek: " + teddyBear1.getMinAge());

        Toy toy1 = teddyBear1;
//        System.out.println("Imię: " + toy1.getName());
        System.out.println("Cena: " + toy1.getPrice());
        System.out.println("Minimalny wiek: " + toy1.getMinAge());

    }
}
