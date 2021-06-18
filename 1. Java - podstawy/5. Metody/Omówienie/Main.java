package methods;

public class Main {
    public static void main(String[] args) {
        // Metodę wywołujemy pisząc jej nazwę oraz nawiasy okrągłe, w których zapisujemy wartości parametrów
        // (wartości parametrów nazywamy argumentami).
        // W poniższym przykładzie wywołujemy metodę o nazwie add, przekazując jej wywołaniu argumenty o wartościach
        // kolejno 2 oraz 3.
        // Metoda add zwraca liczbę całkowitą, wypiszemy tę wartość w konsoli.
        System.out.println(add(2, 3));
        // Metoda add zwraca wartość typu int. W poniższym przykładzie jej wywołania przypiszemy tę wartość
        // (wynik wywołania metody) do zmiennej.
        int a = add(15, 20);
        System.out.println(a);

        // Poniższa metoda nie zwraca wartości, nie miałoby więc sensu przypisanie wyniku wywołania do zmiennej.
        greet("Darek");
        greet("Ania");
    }

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Metodę (funkcję) definiujemy następująco:
    // - public static (na razie nie wnikamy)
    // - typ zwracanej wartości (w tym przypadku metoda zwraca liczbę całkowitą, czyli int)
    // - nazwa metody (w tym przypadku add)
    // - w nawiasach okrągłych parami oddzielonymi przecinkami: typ i nazwa parametru
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    // Poniższa metoda ma nazwę add, zwraca wartość typu int (liczba całkowita).
    // Przyjmuje dwa parametry typu int.
    // Metoda zwraca sumę wartości parametrów.
    public static int add(int x, int y) {
        return x + y;
    }

    // Metoda nie musi zwracać wartości. Dla metod, które nie zwracają wartości typ zwracanej wartości opisujemy
    // za pomocą słówka "void". Metoda greet nie zwraca wartości i przyjmuje parametr typu String.
    // Metoda "powita" osobę o zadanym imieniu.
    public static void greet(String name) {
        System.out.println("Witaj " + name + "!");
    }
}
