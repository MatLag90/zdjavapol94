package pl.sdacademy.exception.exercises;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("------------- Zadanie 1 -------------");
        System.out.println("divide(4, 2):");
        System.out.println(divide(4, 2));
        System.out.println("\ndivide(5, 0):");
        System.out.println(divide(5, 0));

        System.out.println("\n------------- Zadanie 2 -------------");
        int[] array = {2, 5, 9};
        System.out.println(divideTwoArrayElements(array, 2, 1));
        System.out.println(divideTwoArrayElements(array, 22, 1));

        System.out.println("\n------------- Zadanie 3 -------------");
        new RationalNumber(3, 2);
        try {
            new RationalNumber(3, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Obsługa wyjątku");
        }

        System.out.println("\n------------- Zadanie 4 -------------");
        StringList stringList = new StringList("aa", "bb", "cc");
        stringList.get(100);
    }

    //    1. Napisz metodę divide, która przyjmie dwa parametry typu int,
    //    która w przypadku dzielenia przez 0 zwróci null oraz w konsoli wyświetli odpowiednią informację, zamiast wyrzucania wyjątku (w ciele metody używając składni try/catch).
    private static Integer divide(int a, int b) {
        try {
            // Próbujemy (try) zwrócić wynik dzielenia a i b
            return a / b;
        } catch (ArithmeticException e) {
            // Jeśli się nie uda (catch) to wypisujemy w konsoli komunikat i zwracamy null
            System.out.println("Nie wolno dzielić przez 0!");
            return null;
        }
    }

    //    2. Napisz metodę divideTwoArrayElements, która przyjmie trzy parametry:
//    tablicę intów, indeks pierwszego elementu, oraz indeks drugiego elementu,
//    która zwróci wynik dzielenia pierwszego elementu przez drugi element.
//    Metodę należy napisać w taki sposób, żeby w żadnym wypadku nie wyrzucała wyjątku.
//    Metoda, gdy podano nieprawidłowe argumenty, powinna zwrócić null
//    (w treści metody używając składni try/catch).
    private static Integer divideTwoArrayElements(int[] array, int index1, int index2) {
        try {
            return array[index1] / array[index2];
        } catch (RuntimeException e) {
            return null;
        }
    }
}
