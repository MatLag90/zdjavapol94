package pl.sdacademy.inheritance.exercises.school;

import java.util.Arrays;

// 10. Stwórz typ School. Szkoła ma pola: nauczyciele (tablica) i uczniowie (tablica).
// Szkoła oferuje metodę getStudentsAndTeachers, która zwraca tablicę zarówno
// nauczycieli, jak i uczniów.
public class School {
    private Teacher[] teachers;
    private Student[] students;

    public School(Teacher[] teachers, Student[] students) {
        this.teachers = teachers;
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "teachers=" + Arrays.toString(teachers) +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
