package classes.constructors;

public class Main {
    public static void main(String[] args) {
        // Tworzymy obiekt typu Car przy użyciu konstruktora, który przyjmuje dwa argumenty - pierwszy typu String,
        // drugi typu int. Konstruktor wywoływany jest następująco: new <NazwaKlasy>(wartości parametrów)
        Car car1 = new Car("Fiat Punto", 90);
        System.out.println("Prędkość samochodu przypisanego do zmiennej car1: " + car1.speed);
        System.out.println("Model samochodu przypisanego do zmiennej car1: " + car1.model);

        // ---------------------------------
        // Tworzymy obiekt typu Car przy użyciu bezargumentowego konstruktora. Konstruktor nie wykonuje żadnych
        // instrukcji (zajrzyj do jego definicji w klasie Car). Przypisze więc polom domyślne wartości.
        Car car2 = new Car();
        System.out.println("\nPrędkość samochodu przypisanego do zmiennej car2: " + car2.speed);
        System.out.println("Model samochodu przypisanego do zmiennej car2: " + car2.model);
    }
}
