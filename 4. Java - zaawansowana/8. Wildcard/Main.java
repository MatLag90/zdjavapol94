package pl.sdacademy.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>(Arrays.asList("abc", true, 234));
        List<String> stringList = new ArrayList<>(Arrays.asList("Katowice", "Warszawa", "Kraków"));
        List<Integer> integerList = new ArrayList<>(Arrays.asList(5, 10, 3));
        List<Number> numberList = new ArrayList<>(Arrays.asList(123, 23423L, 3.54, 1.2f));

        wildcardExample(objectList);
        wildcardExample(stringList);
        wildcardExample(integerList);
        wildcardExample(numberList);

        superExample(objectList);
//        superExample(stringList);
        superExample(integerList);
        superExample(numberList);

//        extendsExample(objectList);
//        extendsExample(stringList);
        extendsExample(integerList);
        extendsExample(numberList);
    }

    // Wildcard (<?>) oznacza, że możemy użyć różnych typów sparametryzowanych. W tym wypadku
    // możemy użyć typu sparametryzowanego o dowolnej wartości.
    private static void wildcardExample(List<?> list) {
        // Metoda get zwróci na pewno jakiś obiekt - nie wiemy, jakiego typu.
        Object element = list.get(0);
        // Nie możemy do listy dodać elementów - nie wiadomo, jakie są typy elementów tej listy.
//        list.add(123);
//        list.add("abc");
    }

    // <? super Integer> oznacza, że typ sparametryzowany musi być typem Integer lub typem, po którym ten
    // typ dziedziczy (czyli Number lub Object).
    // Metodę, która przyjmie parametr zadeklarowany w taki sposób nazwiemy producerem.
    private static void superExample(List<? super Integer> list) {
        // Nie jesteśmy pewni typów elementów listy - wiemy jedynie, że to obiekty.
        Object element = list.get(0);
        // Wiadomo jednak, że można do takiej listy dodać wartość typu Integer - w końcu wartośc takiego typu
        // to również wartość typu Number jak i Object.
        list.add(55);
    }

    // <? extends Number> mówi o tym, że typ sparametryzowany będzie typem Number lub typem, który po tym typie
    // dziedziczy (np. Integer. Double, Float).
    // Metodę, która przyjmie parametr zadeklarowany w taki sposób nazwiemy consumerem.
    private static void extendsExample(List<? extends Number> list) {
        // Na pewno wiemy, że element listy są liczbami (Number).
        Number element = list.get(0);
        System.out.println(element.doubleValue());
        // Nie możemy dodać wartości do takiej listy - nie wiemy, który z typów rozszerzający typ Number to typ
        // elementów.
//        list.add(5.5);
//        list.add(5);
    }
}
