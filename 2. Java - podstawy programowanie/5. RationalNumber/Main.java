package pl.sdacademy.rationalnumber;

public class Main {
    public static void main(String[] args) {
        RationalNumber twoThirds = new RationalNumber(2, 3);
        System.out.println("Dwie trzecie: " + twoThirds);

        System.out.println("--------- Zadanie 1 ------------");
        RationalNumber opposite = twoThirds.getOpposite();
        System.out.println("Liczba przeciwna do dwóch trzecich: " + opposite);
        // Wywołanie metody i od razu wypisanie wartości zwróconego obiektu:
        System.out.println("Liczba przeciwna do dwóch trzecich: " + twoThirds.getOpposite());

        System.out.println("\n--------- Zadanie 2 ------------");
        System.out.println("Liczba odwrotna do dwóch trzecich: " + twoThirds.getInverse());
        System.out.println(new RationalNumber(5, 7).getInverse());

        System.out.println("\n--------- Zadanie 3 ------------");
        RationalNumber half = new RationalNumber(1, 2);
        System.out.println("Iloczyn " + twoThirds + " i " + half + " jest równy: " + twoThirds.multiply(half));
        System.out.println("Iloczyn " + twoThirds + " i " + twoThirds + " jest równy: " + twoThirds.multiply(twoThirds));


        System.out.println("\n--------- Zadanie 4 ------------");
        System.out.println("Iloraz " + twoThirds + " przez " + half + " jest równy: " + twoThirds.divide(half));

    }
}
