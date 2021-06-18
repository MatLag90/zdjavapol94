package pl.sdacademy.rationalnumber;

public class RationalNumber {
    // licznik
    private int numerator;
    // mianownik
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

//    5. Napisz konstruktor, który przyjmie jeden parametr - liczbę całkowitą.
//    Metoda zwróci liczbę wymierną równą zadanej liczbie całkowitej.
    public RationalNumber(int integer) {
        // TODO do dokończenia! Ważne - nie dodajemy żadnych nowych pól do klasy.
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    // 1. Napisz metodę getOpposite, która zwróci liczbę przeciwną (typu RationalNumber).
    public RationalNumber getOpposite() {
        // -numerator to to samo co -1 * numerator
        return new RationalNumber(-numerator, denominator);
    }

//    2. Napisz metodę getInverse, która zwróci liczbę odwrotną (typu RationalNumber).
    public RationalNumber getInverse() {
        return new RationalNumber(denominator, numerator);
    }

//    3. Napisz metodę multiply, która przyjmie za parametr obiekt będący liczbą wymierną,
//    a która zwróci wynik mnożenia obiektu, dla którego wywołano metodę przez parametr.
//    Dzięki metodzie multiply możemy pomnożyć dwie liczby wymierne - pierwszą będzie ta,
//    której metodę wywołamy, drugą będzie liczba przekazana przy użyciu parametru. Metoda zwróci
//    iloczyn tych dwóch liczb (wynikiem będzie oczywiście również liczba wymierna)
    public RationalNumber multiply(RationalNumber number) {
        int resultNumerator = numerator * number.numerator;
        int resultDenominator = denominator * number.denominator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }

//    4. Napisz metodę divide, która zadziała analogicznie do metody multiply.
    // Wersja 1:
    public RationalNumber divide(RationalNumber divider) {
        int resultNumerator = numerator * divider.denominator;
        int resultDenominator = denominator * divider.numerator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }

    // Wersja 2:
//    public RationalNumber divide(RationalNumber divider) {
//        return multiply(divider.getInverse());
//    }
}
