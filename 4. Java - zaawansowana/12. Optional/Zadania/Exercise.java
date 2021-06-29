package pl.sdacademy.optional;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("--------------- Zadania 1 i 2 -------------");
//        1. Znajdź w kolekcji liczb całkowitych liczbę z przedziału 100 - 115.
//        Przypisz wynik do zmiennej typu Optional.
        Collection<Integer> integers = Arrays.asList(5, 34, 2, 105, 23, 453);
        Optional<Integer> optional = integers.stream()
                .filter(integer -> integer >= 100 && integer <= 115)
                .findFirst();
//        2. Sprawdź, czy do zmiennej z zadania 1 jest przypisana wartość, pod
//        którą kryje się liczba całkowita, jeśli tak, to ją wypisz, jeśli nie,
//        to wypisz w konsoli "brak wartości z przedziału 100 - 115.
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("brak wartości z przedziału 100 - 115");
        }

//      4. Stwórz opcjonalny łańcuch znaków - niech "pod nim" nie kryje się żadna wartość.
        System.out.println("\n--------------- Zadanie 4 -------------");
        Optional<String> ex4 = Optional.empty();
        System.out.println(ex4.isPresent());

//        5. Stwórz opcjonalny łańcuch znaków, "pod którym" kryje się łańcuch "aaaaa".
        Optional<String> ex5 = Optional.of("aaaaa");
        System.out.println(ex5.get());
    }
}
