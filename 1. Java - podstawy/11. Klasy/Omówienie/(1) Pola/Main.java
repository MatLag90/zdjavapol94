package classes.fields;

public class Main {
    public static void main(String[] args) {
        // Deklarujemy zmienną o nazwie car1 typu Car.
        // Po prawej stronie operatora przypisania mamy wywołanie konstruktora. Konstruktor wywołujemy
        // za pomocą słówka new.
        // W wyniku wywołania konstruktora tworzymy nowy obiekt (instancję) typu Car. Będzie to konkretny
        // samochód w naszej aplikacji.
        Car car1 = new Car();
        // Do pola odwołujemy się za pomocą <obiekt>.<pole>
        // z pola możemy skorzystać aby ustawić jego wartość
        car1.speed = 123;
        car1.model = "Ford Fiesta";
        // albo aby tę wartość pobrać.
        System.out.println("Prędkość samochodu przypisanego do zmiennej car1: " + car1.speed);
        System.out.println("Model samochodu przypisanego do zmiennej car1: " + car1.model);

        // ----------------------------------------

        // Zmiennej car2 (typu Car) przypisujemy nowy samochód.
        Car car2 = new Car();
        car2.speed = 123;
        car2.model = "Ford Fiesta";

        // Mimo ustawienia wartości pól analogicznie dla samochodu przypisanego do zmiennej car1
        // zwracamy uwagę, że do zmiennych przypisane są różne obiektu (do obydwu był przypisany nowy samochód).
        System.out.println("car1 == car2: " + (car1 == car2));

        // ----------------------------------------

        // Do zmiennej car3 przypisujemy samochód przypisany do zmiennej car1 (ten sam)
        Car car3 = car1;
        // Widzimy, że do obydwu zmiennych faktycznie mamy przypisany ten sam obiekt (instancję/wystąpienie) klasy Car.
        System.out.println("car1 == car3: " + (car1 == car3));
    }
}
