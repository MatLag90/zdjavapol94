package classes.accessmodifiers.otherpackage;

// Jeśli odwołujemy się do klasy zdefiniowanej w innym pakiecie, należy dodać instrukcję import (możemy to zrobić
// z pomocą IntelliJ) wskazującą gdzie znajduje się opis użytego typu.
// Klasy z tego samego pakietu, jak i z pakietu java.lang są importowane domyślnie.
import classes.accessmodifiers.somepackage.A;

public class C {
    public static void main(String[] args) {
        A a = new A();
        // Nie możemy się odwołać do pola prywatnego:
//        a.x = 1;
        // ani do pola z domyślnym modyfikatorem dostępu (do takiego pola możemy odwołać się tylko w tym samym pakiecie)
//        a.y = 1;
        // Możemy natomiast odwołać się do pola publicznego.
        a.z = 1;
    }
}
