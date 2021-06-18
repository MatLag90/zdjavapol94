package classes.exercises.exercises_3_8;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------- Zadanie 3 ----------");
        Person adamNowak = new Person("Adam", "Nowak", 30);
        System.out.println("Imię osoby: " + adamNowak.getFirstName());
        System.out.println("Nazwisko osoby: " + adamNowak.getLastName());
        System.out.println("Wiek osoby: " + adamNowak.getAge());
        adamNowak.setAge(31);
        System.out.println("Nowy wiek osoby: " + adamNowak.getAge());

        System.out.println("\n-------- Zadanie 8 ----------");
        Person janKowalski = new Person("Jan", "Kowalski", 25);
        Person annaKowalska = new Person("Anna", "Kowalska", 26);
        Person[] attendees = {janKowalski, annaKowalska};
        Party party = new Party(adamNowak, attendees);
        System.out.println("Imię gospodarza: " + party.getHost().getFirstName());
        System.out.println("średni wiek uczestników imprezy: " + party.getAverageAge());
    }
}
