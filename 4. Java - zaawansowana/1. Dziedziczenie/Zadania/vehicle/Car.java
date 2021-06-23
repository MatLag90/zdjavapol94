package pl.sdacademy.inheritance.exercises.vehicle;

// 4. Stworzyć klasę Car oraz klasę Bicycle, które będą rozszerzały klasę Vehicle.
// Do obydwu klas należy dodać pole, które będzie unikatowe dla danej klasy
// (np. rozmiar kół/liczba przerzutek, pojemność silnika/liczba drzwi/coś innego
// opisującego dany pojazd). Dodaj konstruktory ustawiające wartości nowych pól
// oraz ustawiające wartość pól speed oraz maxSpeed korzystając z konstruktora klasy
// Vehicle (przy użyciu słówka super).
public class Car extends Vehicle {
    private boolean convertible;

    public Car(int speed, int maxSpeed, boolean convertible) {
        super(speed, maxSpeed);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

//    6. Nadpisz metodę toString także w klasach Bicycle oraz Car w taki sposób,
//    aby zwracały to, co zwracane jest dla pojazdów, z dodatkową informacją
//    o wartościach pól zdefiniowanych w tych klasach.
    @Override
    public String toString() {
        return super.toString() + ", czy kabriolet: " + convertible;
    }
}
