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

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
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
