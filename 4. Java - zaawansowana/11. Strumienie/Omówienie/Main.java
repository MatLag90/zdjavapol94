package pl.sdacademy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Katowice", "Warszawa", "Kraków", "Ełk", "Opole");
        System.out.println("Metoda forEach kolekcji:");
        // Metoda forEach wykona akcję Consumera, przekazanego jako argument na każdym elemencie kolekcji.
        // Metoda "kryje" pod sobą pętlę for-each. Taki sposób programowania nazywamy programowaniem funkcyjnym.
        // Unikamy w nim jawnego zapisu pętli/instrukcji warunkowych - zapisujemy wywołania metod, które użyją takich
        // instrukcji. Dzięki temu kod jest znacznie czytelniejszy.
        list.forEach(text -> System.out.println("Element listy: " + text));

        System.out.println("\nFilter:");
        // Metoda stream zwraca obiekt generycznego typu Stream. Typ ten reprezentuje obiekt, który oferuje
        // zestaw metod wygodnych w przypadku pracy z wieloma elementami (np. z elementami kolekcji)
        list.stream()
                // Obiekt typu Stream oferuje m.in. metodę filter, która zwraca strumień, przebiegający
                // przez te elementy, które spełniają predykat przekazany jako argument.
                .filter(text -> text.charAt(1) == 'a') // czy drugi znak to 'a'
                // Oferuje również metodę forEach działającą analogicznie do metody forEach opisanej wcześniej.
                .forEach(text -> System.out.println(text));

        System.out.println("\nCollect:");
        Set<String> filteredSet = list.stream()
                .filter(text -> text.endsWith("e"))
                // Metoda collect służy do "zebrania" elementów strumienia i zwrócenia wartości utworzonej na podstawie
                // tych elementów. Jeśli przekażemy jako argument wynik wywołania metody Collectors.toList, to
                // jako wynik dostaniemy listę zawierającą te elementy.
                // Analogicznie, gdy użyjemy wywołania metody Collectors.toSet, to zbierzemy elementy strumienia do
                // zbioru.
                .collect(Collectors.toSet());
        System.out.println(filteredSet);

        System.out.println("\nMap:");
        list.stream()
                // Metoda map służy do przeobrażenia elementów strumienia.
                // W przykładzie przeobrazimy elementy listy (teksty) na ich długości. Jako wynik uzyskamy strumień
                // przebiegający przez liczby całkowite.
                .map(text -> text.length())
                .forEach(textLength -> System.out.println(textLength));

        System.out.println("\nReferencje metod:");
        list.stream()
                // W poprzednim przykładzie mapowaliśmy teksty do ich długości. Opiszmy to w inny sposób, przy użyciu
                // referencji metody length z klasy String. Wskażemy w ten sposób, za pomocą której metody będą
                // teksty mapowane.
                .map(String::length)
                // W poprzednim przykładzie wypisywaliśmy długości tekstów w konsoli.
                // Metodę accept Consumera implementowaliśmy następująco: textLength -> System.out.println(textLength)
                // w tym przykładzie zrobimy to samo w prostszy sposób - wskażemy, że jako implementacji metody accept
                // użyjemy od razu metody println obiektu przypisanego do pola statycznego out klasy System.
                .forEach(System.out::println);
    }
}
