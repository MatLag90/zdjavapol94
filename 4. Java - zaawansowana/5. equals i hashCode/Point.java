package pl.sdacademy.equalshashcode;

public class Point {
    private int x;
    private int y;
    // 2^32 * 2^32 = 2^64

    // 2^32

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Metody equals używamy do sprawdzenia, czy jeden obiekt jest równy drugiemu.
    @Override
    public boolean equals(Object obj) {
        // Jeśli obiekt, z którym porównujemy punkt nie jest instancją klasy Point
        if (!(obj instanceof Point)) {
            // zwracamy fałsz, jako wynik porównania.
            return false;
        }
        // W innym wypadku - jeśli wiemy, że obiekt, z którym porównujemy punkt jest instancją klasy Point,
        // to możemy bezpiecznie rzutować go na typ Point.
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    // Metoda hashCode zwraca skrót obiektu - wartość typu int.
    // Metoda powinna być implementowana w taki sposób, żeby dla obiektów jednego typu uznawanych za różne,
    // "szansa" na uzyskanie takiego samego hashCode'u była jak najmniejsza.
    // Będziemy mówili, że metody equals oraz hashCode są związane kontraktem - jeśli metoda equals zwraca prawdę,
    // gdy porównamy dwa obiekty, to hashCode tych obiektów musi być taki sam.
    // Gdy hashCode obiektów jest różny, to obiekty muszą być różne.
    @Override
    public int hashCode() {
        return x + 31 * y;
    }

}
