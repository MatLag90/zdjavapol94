package pl.sdacademy.optional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Typ Optional reprezentuje opcjonalną wartość. Oferuje zestaw metod przydatnych w przypadku,
        // gdy nie jesteśmy pewni, czy "skrywa pod spodem" wartość.

        // Żeby utworzyć z góry zadany obiekt typu Optional możemy użyć jednej ze statycznych metod:
        // of utworzy opakowaną w Optional konkretną wartość:
//        Optional<String> optional = Optional.of("ABCDE");
        // empty utworzy "pusty" optional:
//        Optional<String> optional = Optional.empty();
        Set<String> names = new HashSet<>();
        names.add("Darek");
        names.add("Anna");
        names.add("Agata");
        // W celu przetestowania kodu dla różnych wariantów, zakomentuj poniższą linijkę (wtedy do zmiennej typu
        // Optional będzie przypisany obiekt nie kryjący pod spodem wartości).
        names.add("Grzesiek");

        // Wybierzemy ze zbioru imion pierwsze imię rozpoczynające się na literę G (takiego w zbiorze może nie być!)
        Optional<String> optional = names.stream()
                .filter(name -> name.startsWith("G"))
                // Metoda findFirst (i findAny) strumienia zwróci opakowany w obiekt typu Optional
                // element strumienia.
                .findFirst();

        // Metoda isPresent zwraca odpowiedź, czy pod optionalem kryje się wartość.
        System.out.println("Czy mamy wartość opakowaną w optional: " + optional.isPresent());

        if (optional.isPresent()) {
            // Metoda get zwraca wartość skrywaną pod optionalem.
            System.out.println("Wartość opakowana w optionala: " + optional.get());
        } else {
            System.out.println("Brak wartości opakowanej w optionala.");
        }

        // Metoda ifPresent przyjmuje jako argument implementację interfejsu Consumer - opis
        // akcji, która będzie wykonana na obiekcie skrywanym pod optionalem (jeśli on istnieje!).
        optional.ifPresent(value -> System.out.println("Akcja wykonywana, gdy pod optionalem kryje się wartość. "
            + "Ta wartość to: " + value));

        // Metoda orElse zwraca wartość opakowaną w optionala, lub argument, jeśli ona nie istnieje.
        System.out.println("Wartość zwrócona przez metodę orElse: " + optional.orElse("Wartość domyślna"));

    }
}
