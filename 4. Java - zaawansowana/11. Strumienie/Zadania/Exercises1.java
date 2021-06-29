package pl.sdacademy.stream.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercises1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Katowice", "Warszawa", "Kraków", "Ełk", "Opole", "ALA");
        List<Integer> integerList = Arrays.asList(5, 3, 6, 2);

        System.out.println("---------- Zadanie 1 --------");
//    1. Wyfiltrujmy elementy tej listy w taki sposób, żeby w wyniku uzyskać te,
//    których długość jest większa niż 5. Wypisz je w konsoli przy użyciu
//    odpowiedniej metody strumienia.
        stringList.stream()
                .filter(text -> text.length() > 5)
                .forEach(text -> System.out.println(text));

//    2. Wyfiltrujmy elementy tej listy w taki sposób, żeby w wyniku uzyskać te,
//    których długość jest najwyżej równa 7. Następnie zbierz (collect) elementy
//    strumienia do listy.
        System.out.println("\n---------- Zadanie 2 --------");
        List<String> ex2 = stringList.stream()
                .filter(text -> text.length() <= 7)
                .collect(Collectors.toList());
        System.out.println(ex2);

//        3. Mapujemy elementy tej listy wybierając ich pierwsze trzy znaki
//        (metoda substring). Wypisz elementy strumienia w konsoli.
        System.out.println("\n---------- Zadanie 3 --------");
        stringList.stream()
                .map(text -> text.substring(0, 3))
                .forEach(text -> System.out.println(text));

        System.out.println("\n---------- Zadanie 4 --------");
//        4. Listę stringów przefiltrować tak, żeby zostawić tylko te, które kończą
//        i rozpoczynają się na literę 'A'. Następnie zliczyć je (metoda count())
        long ex4 = stringList.stream()
                .filter(text -> text.startsWith("A") && text.endsWith("A"))
                .count();
        System.out.println(ex4);

//        5. Zamień listę stringów na listę znaków - niech odbywa się to przez zmapowanie
//        każdego łańcucha znaków do jego pierwszego znaku.
        System.out.println("\n---------- Zadanie 5 --------");
        List<Character> ex5 = stringList.stream()
                .map(text -> text.charAt(0))
                .collect(Collectors.toList());
        System.out.println(ex5);

//        7. Zmapuj listę liczb całkowitych w taki sposób, abyśmy otrzymali wartości
//        dwa razy większe. Wypisz te wartości w konsoli.
        System.out.println("\n---------- Zadanie 7 --------");
        integerList.stream()
                .map(integer -> integer * 2)
                .forEach(integer -> System.out.println(integer));

//        9. Wyfiltruj listę liczb całkowitych pozostawiając tylko wartości parzyste.
//        Wypisz wynik.
        System.out.println("\n---------- Zadanie 9 --------");
        integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(integer -> System.out.println(integer));
    }
}
