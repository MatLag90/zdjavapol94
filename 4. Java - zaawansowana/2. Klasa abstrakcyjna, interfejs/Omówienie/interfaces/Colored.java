package pl.sdacademy.interfaces;

// Interfejs to typ, w którym deklarujemy abstrakcyjne, publiczne metody (na razie tylko takie).
// Nie tworzymy instancji interfejsów, tylko instancje klas, które ten typ implementują.
// Klasa może implementować wiele interfejsów. Gdy klasa nieabstrakcyjna implementuje interfejsu,
// to musi zaimplementować wszystkie metody tego interfejsu.
public interface Colored {
    // Domyślnie metody interfejsu są publiczne i abstrakcyjne (nie musimy pisać "public abstract" w sygnaturze metody).
    // Wszystkie klasy implementujące ten interfejs będą musiały zaimplementować poniższą metodę:
    String getColor();
}
