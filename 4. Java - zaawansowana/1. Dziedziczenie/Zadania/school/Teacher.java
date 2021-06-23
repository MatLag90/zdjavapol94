package pl.sdacademy.inheritance.exercises.school;

// 9. Stwórz typ Teacher - nauczyciel jest osobą, która ma dodatkowo pole subject.
public class Teacher extends Person {
    private String subject;

    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
