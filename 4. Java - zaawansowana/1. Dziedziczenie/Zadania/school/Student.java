package pl.sdacademy.inheritance.exercises.school;

import java.util.Arrays;

// 9. Stwórz klasę Student - uczeń jest osobą, która ma dodatkowo pole
// grades - tablica ocen.
public class Student extends Person {
    private int[] grades;

    public Student(String firstName, String lastName, int[] grades) {
        super(firstName, lastName);
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + Arrays.toString(grades) +
                "} " + super.toString();
    }
}
