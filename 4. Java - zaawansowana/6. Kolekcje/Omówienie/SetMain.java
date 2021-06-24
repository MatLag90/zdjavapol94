package pl.sdacademy.collections;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        // HashSet to jedna z implementacji zbioru. W przypadku zbioru elementy nie są uporządkowane
        // (nie jest ważna kolejność, przez co nie odwołujemy się do nich na bazie indeksów) oraz
        // nie powtarzają się - w zbiorze element jest lub nie.
        // Implementacja HashSet to implementacja zbioru, bazująca na hashu obiektów.
        // Hash obiektu to wartość uzyskiwana za pomocą metody hashCode. To wartość typu int - skrót obiektu.
        // Pozwala w prosty sposób upewnić się, czy obiekty się różnią. Jeśli ich skróty są różne, to na pewno
        // obiekty są różne. Jeśli ich skróty są takie same, to jest duża szansa, że są sobie równe - dla pewności
        // następuje wtedy sprawdzenie z wykorzystaniem metody equals. HashSet bazuje na tej własności.
        Set<String> set1 = new HashSet<>();
        set1.add("Dariusz");
        set1.add("Bartosz");
        set1.add("Andrzej");
        set1.add("Celina");
        System.out.println(set1);
        // Zwracamy uwagę na to, że poniższe wywołanie metody add nie zmieni zbioru
        // - do zbioru należy już taki element.
        set1.add("Celina");
        System.out.println(set1);

        System.out.println("Wartość zbioru po usunięciu elementu \"Dariusz\": " + set1);
        System.out.println("Liczba elementów zbioru: " + set1.size());
        System.out.println(set1.contains("Dariusz"));

        // Przez elementy zbioru możemy przebieg za pomocą pętli for-each (podobnie jak przez elementy
        // tablicy lub listy)
        System.out.println("\nWypisanie elementów przy użyciu pętli for-each:");
        for (String element : set1) {
            System.out.println("Wartość elementu: " + element);
        }
    }
}
