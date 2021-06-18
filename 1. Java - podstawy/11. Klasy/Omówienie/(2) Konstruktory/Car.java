package classes.constructors;

public class Car {
    String model;
    int speed;

    // Konstruktor jest instrukcją do tworzenia obiektów. Wywołanie konstruktora zwraca nowy obiekt.
    // Konstruktor definiujemy następująco <Nazwa Klasy>(argumenty). Następnie w nawiasach wąsatych zapisujemy
    // ciało konstruktora.
    // Poniższy konstruktor przyjmuje dwa parametry - kolejno typu String i int
    Car(String model, int speed) {
        // Przypiszemy pierwszy argument do pola model.
        // this to odwołanie do obiektu, który jest aktualnie tworzony.
        // w tym przypadku odwołamy się do pola model obiektu, który tworzymy, dlatego że argument o nazwie model
        // "zakrył" nazwą pole klasy.
        this.model = model;
        // Działamy analogicznie dla drugiego argumentu - ustawimy wartość pola speed na wartość argumentu.
        this.speed = speed;
    }

    // Jeśli w klasie nie ma zdefiniowanego żadnego konstruktora, to mamy do dyspozycji konstruktor domyślny.
    // Jest on bezparametrowy, publiczny i ustawia domyślne wartości pól.

    // W klasie możemy mieć zdefiniowany więcej niż jeden konstruktor.
    // W tym przykładzie dodamy taki konstruktor:
    Car() {
        // Konstruktor nie wykonuje żadnych operacji - w takim wypadku tworzony obiekt będzie miał wartości domyślne
        // pól. Pola typu prymitywnego liczbowego będą miały wartość 0, typu boolean wartość false, a pola typów
        // obiektowych wartość null. null to reprezentacja braku obiektu.
    }
}
