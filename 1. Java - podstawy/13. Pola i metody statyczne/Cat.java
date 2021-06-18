package staticmembers;

public class Cat {
    private int age;
    private double weight;
    // Słówko kluczowe "static" oznacza, że pole jest statyczne. To znaczy, że rezerwowane będzie
    // JEDNO miejsce w pamięci wspólne dla całej klasy Cat.
    // Poniższy przykład będzie odwołaniem do liczby utworzonych obiektów klasy Cat.
    private static int count;

    public Cat(int age, double weight) {
        this.age = age;
        this.weight = weight;
        // Jeśli wywołamy konstruktor, to wartość pola statycznego count zwiększana jest o 1.
        count++;
    }

    // Metoda statyczna, podobnie jak pole, związana jest z całą klasą, a nie konkretnym obiektem.
    // W metodzie statycznej nie możemy odwołać się bezpośrednio do pola/metody niestatycznej - w końcu
    // wywołujemy ją w kontekście całej klasy, a nie konkretnego obiektu!
    public static int getCount() {
        return count;
    }
}
