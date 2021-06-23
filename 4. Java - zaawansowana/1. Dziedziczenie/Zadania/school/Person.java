package pl.sdacademy.inheritance.exercises.school;

// 9. Stwórz typ Person, reprezentujący osobę. Niech klasa posiada pola firstName, lastName.
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
