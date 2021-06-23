package pl.sdacademy.abstractclass;

public class Main {
    public static void main(String[] args) {
        // Nie możemy utworzyć instancji klasy abstrakcyjnej.
//        Vehicle vehicle1 = new Vehicle(50, 90);
//        System.out.println(vehicle1);
        // Przypiszemy do zmiennej typu Vehicle obiekt klasy nieabstrakcyjnej, która tę klasę rozszerza.
        Vehicle vehicle1 = new Car(80, 200, true);
        System.out.println(vehicle1);
        // O obiekcie przypisanym do zmiennej vehicle wiemy na pewno, że implementuje metodę repair.
        // Mimo, że metoda repair w klasie Vehicle nie posiada implementacji, to obiekt przypisany do zmiennej
        // vehicle1 musi być typu, który taką implementację będzie miał.
        vehicle1.repair();

        // Analogiczny przykład z użyciem klasy Bicycle, która również rozszerza klasę abstrakcyjną Vehicle,
        // a co za tym idzie implementuje metodę abstrakcyjną repair.
        Vehicle vehicle2 = new Bicycle(20, 50);
        System.out.println(vehicle2);
        vehicle2.repair();
    }
}
