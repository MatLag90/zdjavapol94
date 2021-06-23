package pl.sdacademy.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- Przykłady użycia klasy Animal --------");
        // Przykład tworzenia zwierzęcia
        Animal animal1 = new Animal("mysz polna", 123);
        System.out.println(animal1.getSpecies());
        animal1.makeASound();

        System.out.println("\n------- Przykłady użycia klasy Dog --------");
        // Wywołanie konstruktora typu Dog (tworzenie obiektu tego typu).
        // Tworząc psa jednocześnie tworzymy zwierzę (bo pies to też zwierzę)
        Dog dog1 = new Dog(4321, "York");
        System.out.println(dog1.getBreed());
        // Możemy wywołać metody odziedziczone po typie Animal:
        System.out.println(dog1.getSpecies());
        System.out.println(dog1.getWeight());
        // Wywołamy nadpisaną metodę makeASound:
        dog1.makeASound();

        System.out.println("\n------ Polimorfizm ---------");
        // Pies jest zwierzęciem, możemy więc obiekt typu Dog przypisać do zmiennej typu Animal.
        // Przypisanie wartości jednego typu do zmiennej innego typu to polimorfizm.
        Animal animal2 = dog1;
        // Zwierzęta oferują metodę getSpecies:
        System.out.println(animal2.getSpecies());
        // Oraz metodę, dzięki której wydają dźwięk.
        // Zwróćmy uwagę na to, że w tym wypadku do zmiennej o nazwie animal2
        // mamy przypisany obiekt klasy Dog. W klasie Dog metoda ta jest nadpisana,
        // więc wywołamy metodę z klasy Dog (bo pracujemy w kontekście psa).
        animal2.makeASound();
        // Nie mamy możliwości wywołania metody getBreed - zmienna jest typu Animal,
        // a ta metoda nie jest zdefiniowana dla tej klasy.
//        System.out.println(animal2.getBreed());

        // Elementem tablicy zwierząt może być pies.
        Animal[] animals = {
                animal1,
                // Równie dobrze moglibyśmy napisać animal2 - do zmiennych
                // dog1 i animal2 jest przypisany ten sam obiekt.
                dog1,
                new Animal("kot", 3000),
                new Dog(10000, "Owczarek niemiecki")
        };
        System.out.println("\nWagi zwierząt z tablicy:");
        for (Animal animal : animals) {
            System.out.println(animal.getWeight());
        }

        System.out.println("\nWywołania metody describe:");
        System.out.println("Wywołanie dla obiektu klasy Animal:");
        describe(animal1);
        // Możemy wywołać metodę, która oczekuje parametru typu Animal przekazując jako argument psa.
        System.out.println("Wywołanie dla obiektu klasy Dog:");
        describe(dog1);

        System.out.println("\n------ Object ---------");
        // Każda klasa dziedziczy po klasie Object, więc psa można przypisać do zmiennej typu Object.
        Object object1 = dog1;
        // Podobnie jak każdą inną wartość typu obiektowego.
        Object object2 = "abc";

        // Przy i zwierzęta nadpisują metodę toString.
        System.out.println(dog1.toString());
        // Jeśli przekażemy obiekt jako argument metodzie System.out.println, to będzie wypisany w konsoli
        // wedle jego definicji metody toString.
        System.out.println(dog1);
        System.out.println(animal1);
    }

    // Metoda utworzona na potrzebę przykładu polimorfizmu - będziemy ją wywoływali z argumentem, który jest psem.
    private static void describe(Animal animal) {
        System.out.println("Gatunek zwierzęcia: " + animal.getSpecies());
        System.out.println("Waga zwierzęcia: " + animal.getWeight());
    }
}
