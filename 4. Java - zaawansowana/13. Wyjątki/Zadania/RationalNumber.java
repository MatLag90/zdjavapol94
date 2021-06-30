package pl.sdacademy.exception.exercises;

//3. Edytuj tworzoną wcześniej klasę RationalNumber. W przypadku, gdy będzie
// tworzona instancja o mianowniku równym zero, powinien zostać wyrzucony wyjątek
// typu IllegalArgumentException z odpowiednim komunikatem.
public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Zerowy mianownik liczby wymiernej");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public RationalNumber getOpposite() {
        return new RationalNumber(-numerator, denominator);
    }

    public RationalNumber getInverse() {
        return new RationalNumber(denominator, numerator);
    }

    public RationalNumber multiply(RationalNumber number) {
        int resultNumerator = numerator * number.numerator;
        int resultDenominator = denominator * number.denominator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }

    public RationalNumber divide(RationalNumber divider) {
        int resultNumerator = numerator * divider.denominator;
        int resultDenominator = denominator * divider.numerator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }
}
