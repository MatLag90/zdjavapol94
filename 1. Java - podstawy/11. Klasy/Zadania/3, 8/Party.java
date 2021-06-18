package classes.exercises.exercises_3_8;

// 8. Stwórz klasę Party, która będzie miała pola: host (gospodarz),
// attendees (uczestnicy) oraz konstruktor i gettery.
// Do klasy dodaj metodę getAverageAge, która zwróci średni wiek uczestników.
public class Party {
    private Person host;
    private Person[] attendees;

    public Party(Person host, Person[] attendees) {
        this.host = host;
        this.attendees = attendees;
    }

    public Person getHost() {
        return host;
    }

    public Person[] getAttendees() {
        return attendees;
    }

    public double getAverageAge() {
        double totalAge = host.getAge();
        for (Person attendee : attendees) {
            totalAge += attendee.getAge();
        }
        return totalAge / (attendees.length + 1);
    }
}
