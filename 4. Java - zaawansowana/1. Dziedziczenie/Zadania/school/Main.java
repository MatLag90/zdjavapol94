package pl.sdacademy.inheritance.exercises.school;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski");
        System.out.println(person1);
        Student student1 = new Student("Adam", "Nowak", new int[]{3, 5, 1, 2, 4});
        System.out.println(student1);
        Teacher teacher1 = new Teacher("Anna", "Kowalska", "biologia");
        System.out.println(teacher1);

        Student student2 = new Student("Beata", "Nowak", new int[]{4, 2, 5, 1});
        Teacher teacher2 = new Teacher("Michał", "Kaczorowski", "geografia");

        System.out.println("\n----------- Zadanie 10 --------");
        Student[] students = {student1, student2};
        Teacher[] teachers = {teacher1, teacher2};
        School school1 = new School(teachers, students);
        System.out.println(school1);
    }
}
