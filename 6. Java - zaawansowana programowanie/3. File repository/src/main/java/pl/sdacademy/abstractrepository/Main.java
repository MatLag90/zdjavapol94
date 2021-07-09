package pl.sdacademy.abstractrepository;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------- CarRepository --------");
        CarRepository carRepository = new CarRepository("cars.txt");
        System.out.println(carRepository.getAll());
        System.out.println(carRepository.get(5));
        carRepository.add(new Car(543, "Abc", "Xyz"));

        System.out.println("\n---------- PersonRepository --------");
        PersonRepository personRepository = new PersonRepository("people.txt");
        System.out.println(personRepository.getAll());
        System.out.println(personRepository.get(11));
        personRepository.add(new Person("A", "B", 9));

    }
}
