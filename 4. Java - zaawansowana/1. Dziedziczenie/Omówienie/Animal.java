package pl.sdacademy.inheritance;

// Klasa Animal reprezentuje zwierzę. Klasa Dog po niej dziedziczy (ją rozszerza).
// Klasa Animal dziedziczy po klasie Object (każda klasa dziedziczy po klasie Object).
// Frazy "extends Object" nie musimy zapisywać.
public class Animal {
    // Pole reprezentujące gatunek zwierzęcia.
    private String species;
    // Pole reprezentujące wagę zwierzęcia.
    private int weight;

    public Animal(String species, int weight) {
        // Każdy konstruktor w pierwszej kolejności wywołuje konstruktor typu, po którym dziedziczymy.
        // Jeśli tego nie zapiszemy jawnie, to wywołany będzie bezargumentowy konstruktor nadklasy (superklasy).
        // Czyli zapis super(); jest opcjonalny - i tak zostanie wywołana ta instrukcja, jeśli nie zapiszemy
        // wywołania konstruktora typu, po którym dziedziczymy.
//        super();
        this.species = species;
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public int getWeight() {
        return weight;
    }

    // Klasa Dog nadpisze tę metodę.
    // Przy okazji - czwarty modyfikator dostępu, użyty dla przykładu to protected.
    // Mówi, ze możemy odwołać się do metody we wszystkich klasach z tego samego pakietu oraz
    // we wszystkich klasach dziedziczących po tej klasie.
    protected void makeASound() {
        System.out.println("Zwierzę wydaje odgłos");
    }

    // Nadpiszemy odziedziczoną z klasy Object metodę toString. Metoda ta służy do przedstawienia obiektu w postaci
    // tekstowej (ma być to opis, podsumowujący ten obiekt).
    // Jeśli wywołamy metodę toString na obiekcie typu Animal, to ta metoda będzie wywoływana.
    // Adnotacja @Override służy do sprawdzenia na etapie kompilacji, czy faktycznie jest to nadpisanie metody.
    @Override
    public String toString() {
        return "gatunek: " + species + ", waga: " + weight;
    }
}

