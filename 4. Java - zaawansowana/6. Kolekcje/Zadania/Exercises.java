package pl.sdacademy.collections.exercises;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(50);
        integerList.add(11);
        integerList.add(20);
        integerList.add(33);

        List<String> stringList = new LinkedList<>();
        stringList.add("aregaergea");
        stringList.add("agferg");
        stringList.add("abcdefa");

        System.out.println("--------- Zadanie 1 ----------");
        zadanie1(integerList);

        System.out.println("\n--------- Zadanie 2 ----------");
        zadanie2(integerList);

        System.out.println("\n--------- Zadanie 3 ----------");
        System.out.println(zadanie3(integerList));

        System.out.println("\n--------- Zadanie 4 ----------");
        System.out.println(zadanie4(stringList));

        System.out.println("\n--------- Zadanie 5 ----------");
        System.out.println(zadanie5(stringList));

        System.out.println("\n--------- Zadanie 7 ----------");
//        Set<String> z7 = zadanie7(stringList);
        System.out.println(zadanie7(stringList));

        System.out.println("\n--------- Zadanie 11 ----------");
        Converter<String> converter = new Converter<>();
        System.out.println(converter.toSet(stringList));
    }

//    1. Tworzymy metodę zadanie1, która przyjmie za parametr listę,
//    której elementy są typu Integer, a która wypisze wszystkie elementy listy
//    przy użyciu pętli for-each.
    private static void zadanie1(List<Integer> integerList) {
        for (Integer element : integerList) {
            System.out.println(element);
        }
    }

//    2. Tworzymy metodę zadanie2, która przyjmie za parametr listę,
//    której elementy są typu Integer, a która wypisze wszystkie elementy
//    listy wraz z ich indeksami.
    private static void zadanie2(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(i + ": " + integerList.get(i));
        }
    }

//    3. Tworzymy metodę zadanie3, która przyjmie za parametr listę, której
//    elementy są typu Integer, a która zwróci średnią wartości z tej listy.
    private static double zadanie3(List<Integer> integerList) {
        double sum = 0;
        for (Integer element : integerList) {
            sum += element;
        }
        return sum / integerList.size();
    }

//    4. Tworzymy metodę zadanie4, która przyjmie za parametr listę Stringów,
//    a która zwróci odpowiedź na pytanie, czy lista zawiera łańcuch znaków,
//    który rozpoczyna się od znaków "abc".
    private static boolean zadanie4(List<String> stringList) {
        for (String element : stringList) {
            if (element.startsWith("abc")) {
                return true;
            }
        }
        return false;
    }

//    5. Tworzymy metodę zadanie5, która przyjmie za parametr listę Stringów,
//    a która zwróci odpowiedź na pytanie, ile elementów ma
//    nieparzystą liczbę znaków.
    private static int zadanie5(List<String> stringList) {
        int result = 0;
        for (String element : stringList) {
            if (element.length() % 2 == 1) {
                result++;
            }
        }
        return result;
    }

//    7. Tworzymy metodę zadanie7, która za parametr przyjmie listę Stringów,
//    a zwróci zbiór, zawierający elementy tej listy.
//  Wersja 1:
//    private static Set<String> zadanie7(List<String> stringList) {
//        Set<String> result = new HashSet<>();
//        for (String element : stringList) {
//            result.add(element);
//        }
//        return result;
//    }

    // Wersja 2:
    private static Set<String> zadanie7(List<String> stringList) {
        return new HashSet<>(stringList);
    }

}
