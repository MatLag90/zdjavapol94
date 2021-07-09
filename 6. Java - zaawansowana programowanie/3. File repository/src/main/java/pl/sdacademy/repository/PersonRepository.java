package pl.sdacademy.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonRepository {
    private Set<Person> people;
    private Path filePath;

    public PersonRepository(String filename) {
        filePath = Paths.get(filename);
        try {
            people = Files.lines(filePath)
                    .map(this::createPerson) // inaczej: .map(fileLine -> createPerson(fileLine))
                    .collect(Collectors.toSet());
        } catch (IOException e) {
            throw new RuntimeException("Błąd odczytu danych z pliku", e);
        }
    }

    public Set<Person> getAll() {
        return people;
    }

    private Person createPerson(String fileLine) {
        String[] lineParts = fileLine.split(",");
        int id = Integer.parseInt(lineParts[0]);
        String firstName = lineParts[1];
        String lastName = lineParts[2];
        int age = Integer.parseInt(lineParts[3]);
        return new Person(id, firstName, lastName, age);
    }

    //    1. Dodaj metodę get, która przyjmie za parametr wartość typu int,
//    a która zwróci osobę o zadanym identyfikatorze. Jeśli takiej osoby
//    nie będzie zwróć null.
//    Wersja 1:
//    public Person get(int id) {
//        for (Person person : people) {
//            if (person.getId() == id) {
//                return person;
//            }
//        }
//        return null;
//    }

    //    Wersja 2:
    public Person get(int id) {
        return people.stream()
                .filter(person -> person.getId() == id)
                .findFirst()
                .orElse(null);
    }

    //    2. Dodaj do klasy PersonRepository prywatną metodę generateNextId, która nie przyjmie
//    żadnego parametru, a która zwróci "wolną" wartość identyfikatora osoby.
//    Niech metoda działa następująco - znajdujemy maksymalny identyfikator
//    i dodajemy do niego 1.
//    Wersja 1:
//    private int generateNextId() {
//        int maxId = 0;
//        for (Person person : people) {
//            if (person.getId() > maxId) {
//                maxId = person.getId();
//            }
//        }
//        return maxId + 1;
//    }

    //    Wersja 2:
    private int generateNextId() {
        return people.stream()
                .mapToInt(Person::getId)
                .max()
                .orElse(0) + 1;
    }

//    3. Dodaj do klasy PersonRepository prywatną metodę createFileLine, która zadziała
//    odwrotnie do metody createPerson. Metoda przyjmuje jako parametr osobę, a zwraca
//    wiersz, który będzie odpowiadać tej osobie. Przykładowo - dla parametru
//    o wartości będącej osobą o id 3, imieniu Aaa, nazwisku Bbb i wieku 5 metoda
//    zwróci "3,Aaa,Bbb,5".
    private String createFileLine(Person person) {
        return person.getId() + "," + person.getFirstName()
                + "," + person.getLastName() + "," + person.getAge();
    }

//    4. Dodaj do klasy PersonRepository prywatną metodę updateFile, która
//    zapisze aktualny stan zbioru osób do pliku (przy użyciu metody createFileLine).
    private void updateFile() {
        List<String> fileLines = people.stream()
//                .map(person -> createFileLine(person))
                .map(this::createFileLine)
                .collect(Collectors.toList());
        try {
            Files.write(filePath, fileLines);
        } catch (IOException e) {
            throw new RuntimeException("Błąd zapisu danych do pliku", e);
        }
    }

//    6. Dodaj do klasy PersonRepository metodę add, która przyjmie jako parametr
//    obiekt typu Person, a która doda do repozytorium daną osobę.
    public void add(Person person) {
        person.setId(generateNextId());
        people.add(person);
        updateFile();
    }
}
