package pl.sdacademy.stream.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercises2 {
    public static void main(String[] args) {
        System.out.println("---------- Zadanie 1 -------------");
//        1. Stwórz listę osób. Wypisz wszystkie osoby z listy.
        List<Person> people = Arrays.asList(
                new Person("Adam", "Adamowski", 60, 1.8f),
                new Person("Anna", "Annowska", 30, 1.65f),
                new Person("Tomasz", "Tomaszowski", 45, 1.7f),
                new Person("Marian", "Marianowski", 14, 1.5f),
                new Person("Nikola", "Kowalski", 24, 2.5f)
        );
        // Wersja 1:
        people.forEach(person -> System.out.println(person));
        // Wersja 2:
//        people.forEach(System.out::println);

//        2. Z listy osób wypisać imię i nazwisko osób, których wiek jest większy od
//        20 lub wzrost jest większy niż 1.75.
        System.out.println("\n---------- Zadanie 2 -------------");
        people.stream()
                .filter(person -> person.getAge() > 20 || person.getHeight() > 1.75)
                .forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));

//        3. Wyfiltrować osoby tak, żeby zostały osoby o wieku mniejszym niż 18.
//        Następnie przypisać do zmiennej typu List<String> listę imion wraz
//        z nazwiskami takich osób.
        System.out.println("\n---------- Zadanie 3 -------------");
        List<String> ex3 = people.stream()
                .filter(person -> person.getAge() < 18)
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .collect(Collectors.toList());
        System.out.println(ex3);

//        4. Sprawdź, czy w liście osób istnieje osoba o nazwisku "Kowalski" (za pomocą
//        jednej metody strumienia!). Spróbuj znaleźć odpowiednią metodę strumienia,
//        lub wygooglować rozwiązanie.
        System.out.println("\n---------- Zadanie 4 -------------");
        boolean ex4 = people.stream()
                .anyMatch(person -> "Kowalski".equals(person.getLastName()));
        System.out.println(ex4);

//        6. Z listy osób wybierz takie, które mają imię rozpoczynające się na tę samą literę,
//        co nazwisko. Zbierz do zbioru wysokości takich osób.
        System.out.println("\n---------- Zadanie 6 -------------");
        Set<Float> ex6 = people.stream()
                .filter(person -> person.getFirstName().charAt(0) == person.getLastName().charAt(0))
                .map(person -> person.getHeight()) // wersja 2, z referencją metody: .map(Person::getHeight())
                .collect(Collectors.toSet());
        System.out.println(ex6);

//        8. Posortuj osoby na bazie ich nazwiska. Wypisz te osoby w konsoli.
        System.out.println("\n---------- Zadanie 8 -------------");
        people.stream()
                .sorted((person1, person2) -> person1.getLastName().compareTo(person2.getLastName()))
                .forEach(System.out::println); // inaczej: .forEach(person -> System.out.println(person));
    }
}
