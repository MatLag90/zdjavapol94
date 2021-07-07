package pl.sdacademy;

public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository("people.txt");
        System.out.println(personRepository.getAll());
        System.out.println("Osoba o id 10: " + personRepository.get(10));
        System.out.println("Osoba o id 25: " + personRepository.get(25));
        Person newPerson = new Person("Urszula", "Urszulowska", 35);
        personRepository.add(newPerson);
    }
}
