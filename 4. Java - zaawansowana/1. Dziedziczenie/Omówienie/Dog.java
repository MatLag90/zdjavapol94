package pl.sdacademy.inheritance;

// Klasa Dog dziedziczy po klasie Animal (inaczej: rozszerza tę klasę) - o czym mówi "extends Animal".
// Obiekty typu Dog będą czymś więcej, niż zwierzętami (ale dalej będą też zwierzętami).
public class Dog extends Animal {
    private String breed;

    public Dog(int weight, String breed) {
        // Musimy wywołać konstruktor typu, po którym dziedziczymy. Wywołamy go za pomocą słówka super.
        // Przekazujemy jako pierwszy argument łańcuch znaków, jako drugi wartość typu int, zgodnie z tym,
        // jak opisano konstruktor w klasie Animal.
        // Tworzymy zwierzę o gatunku pies, więc "na sztywno" jako pierwszy argument przekażemy łańcuch znaków
        // "Pies". Waga to liczba, którą otrzymaliśmy jako argument.
        super("Pies domowy", weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    // Nadpiszemy metodę makeASound. Gdy nadpisujemy metodę, dodajemy jej adnotację @Override (na etapie
    // kompilacji nastąpi sprawdzenie, czy na pewno jest to nadpisanie metody).
    // Nadpisanie metody to zmiana jej działania w typie dziedziczącym. Psy (obiekty typu Dog) będą wydawały inaczej
    // dźwięki niż inne zwierzęta (obiekty typu Animal).
    @Override
    public void makeASound() {
        System.out.println("Hau hau!");
    }

    // Nadpiszemy metodę toString (nadpisujemy metodę z klasy Animal, która nadpisała tę z Object).
    @Override
    public String toString() {
        // W implementacji skorzystamy z implementacji z klasy Animal
        // - super.toString() wywoła metodę toString opisaną w typie Animal i zwróci jej wartość.
        // Czyli nadpisując metodę skorzystamy z nadpisywanej implementacji.
        return super.toString() + ", rasa: " + breed;
    }
}
