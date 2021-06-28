package pl.sdacademy.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPredykat tworzony za pomocą klasy:");
        // Utworzymy obiekt typu ShorterThan4 i przypiszemy do zmiennej.
        Predicate<String> shorterThan4 = new ShorterThan4();
        // Mamy do dyspozycji metodę test (którą klasa implementuje):
        System.out.println(shorterThan4.test("Ala"));
        System.out.println(shorterThan4.test("Darek"));

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nPredykat tworzony za pomocą klasy anonimowej:");
        // Przykład utworzenia klasy anonimowej. Klasa anonimowa nie ma nazwy - tworzymy ją do jednorazowego
        // stworzenia obiektu. W tym przypadku stworzymy klasę anonimową implementującą interfejs Predicate<String>
        Predicate<String> shorterThan10 = new Predicate<String>() {
            // implementacja metody abstrakcyjnej.
            @Override
            public boolean test(String text) {
                return text.length() < 10;
            }
        };
        System.out.println(shorterThan10.test("Abcdefghij"));
        System.out.println(shorterThan10.test("Abc"));

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nPredykat tworzony za pomocą lambdy:");
        // Jeśli potrzebujemy utworzyć obiekt implementujący interfejs funkcjonalny (taki z jedną metodą abstrakcyjną)
        // możemy użyć lambdy - zapiszemy w takim wypadku implementację tej jednej jedynej metody abstrakcyjnej.
        // W przypadku predykatu implementujemy metodę, która przyjmuje jeden argument (w tym przypadku typu String),
        // a która zwraca wartość logiczną.
        // Parametr nazwiemy text, a metoda będzie zwracała informację, czy długość tekstu jest mniejsza niż 7.
        // Lambdę zapisujemy następująco:
        // (<nazwy argumentów>) -> (ciało metody)
        // Jeśli parametr jest jeden, to nawiasy okrągłe możemy pominąć. Jeśli implementowana metoda abstrakcyjna
        // zwraca wartość, to ciało metody będzie instrukcją, której wynik będzie zwracany.
        Predicate<String> shorterThan7 = text -> text.length() < 7;
        System.out.println(shorterThan7.test("Warszawa"));
        System.out.println(shorterThan7.test("Opole"));

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nConsumer:");
        // Consumer to interfejs funkcjonalny, którego jedyna metoda abstrakcyjna przyjmuje jeden argument,
        // a która niczego nie zwraca. Obiekt implementujący ten interfejs reprezentuje akcję do wykonania
        // na obiektach zadanego typu.
        Consumer<Integer> integerPrinter = integer -> System.out.println("Wypisuję liczbę: " + integer);
        integerPrinter.accept(123);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nSupplier:");
        // Supplier to producent/dostawca - implementuje bezparametrową metodę "dostarczającą" obiekty zadanego typu.
        Supplier<Double> randomDoubleSupplier = () -> {
            // Wielowierszowe ciało lambdy zapisujemy w nawiasach wąsatych.
            Random random = new Random();
            return random.nextDouble();
        };
        System.out.println(randomDoubleSupplier.get());

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nFunction");
        // Funkcja przyjmuje argument zadanego typu i zwraca wartość drugiego typu. W naszym przykładzie obiekt
        // będzie reprezentował funkcję przyjmującą parametr typu String i zwracającą wartość typu Integer.
        Function<String, Integer> stringLength = text -> text.length();
        System.out.println(stringLength.apply("abc"));

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nBiFunction");
        // Dwuparametrowa funkcja - pierwszy typ sparametryzowany - typ pierwszego parametru, drugi to typ parametru
        // drugiego, a trzeci to typ wartości zwracanej przez funkcję.
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(2, 3));

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nFiltrowanie za pomocą utworzonej metody filter:");
        List<String> list = Arrays.asList("Katowice", "Warszawa", "Kraków", "Ełk", "Opole");
        System.out.println(filter(list, shorterThan7));
        // Przykład zastosowania lambd przy wywołaniu metody:
        System.out.println(filter(list, text -> text.length() == 8));
        System.out.println(filter(list, text -> text.contains("a")));
    }

    // Przykładowa metoda przyjmująca dwa parametry - listę tekstów i predykat tekstów (tester tekstów).
    // Metoda zwróci listę składającą się z tych elementów pierwszego argumentu, które przeszły przez zadany test.
    private static List<String> filter(List<String> list, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        for (String element : list) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
