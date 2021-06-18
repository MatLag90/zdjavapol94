package classes.exercises.exercises_3_8;

//3. Stwórz klasę Person, która będzie miała pola: firstName, lastName oraz age
// oraz konstruktor (ustawiający wartości wszystkich pól), gettery i setter dla
// wieku.
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
