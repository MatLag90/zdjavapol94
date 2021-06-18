package pl.sdacademy.drink;

//    N.1 Stwórz klasę reprezentującą napój. Napój charakteryzuje jego objętość (w ml), nazwa,
//    informacja o tym, czy jest gazowany. Dodaj konstruktor oraz gettery.
//    Utwórz obiekt, wywołaj gettery.
//    N.2 Dodaj setter objętości. Utworzonemu obiektowi zmień objętość - sprawdź zmianę za pomocą
//    gettera.
//    N.3 Napoju można się napić (dodaj metodę to reprezentującą). Jako argument zadawana jest pita
//    objętość. Objętość napoju ulega pomniejszeniu o upitą wartość.
//    N.4 W przypadku, gdy następuje próba wypicia większej ilości, niż objętość napoju, objętość
//    napoju zostaje wyzerowana.
//    N.5 Przy piciu napoju w konsoli zostaje wypisane "gul" dla każdych upitych 100 ml.
//    N.6 Jeśli następuje chęć wypicia większej ilości niż ta, która w napoju jest dostępna, dodatkowo wypisane jest w konsoli "wyzerowano!".
public class Drink {
    private int volume;
    private String name;
    private boolean sparkling;

    public Drink(int volume, String name, boolean sparkling) {
        this.volume = volume;
        this.name = name;
        this.sparkling = sparkling;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public boolean isSparkling() {
        return sparkling;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Jeśli klasa posiada metodę o sygnaturze public String toString()
    // to będzie to instrukcja, jak obiekt tej klasy ma być przetworzony na tekst.
    // Metoda będzie automatycznie użyta np. gdy przekażemy obiekt bezpośrednio
    // jako argument metody System.out.println (patrz przykład w klasie Main).
    public String toString() {
        return "Napój o nazwie: " + name + ", objętości: " + volume + ", czy gazowany: " + sparkling;
    }

    public void drink(int volume) {
        // Jeśli objętość do wypicia jest większa niż objętość napoju
        if (volume > this.volume) {
            // to objętość do wypicia będzie równa objętości napoju.
            volume = this.volume;
        }
        for (int i = 0; i < volume; i += 100) {
            System.out.println("gul");
        }
        this.volume -= volume;
        if (this.volume == 0) {
            System.out.println("wyzerowano");
        }
    }
}
