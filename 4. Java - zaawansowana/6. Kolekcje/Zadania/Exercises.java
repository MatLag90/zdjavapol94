package pl.sdacademy.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        stringList.add("abcdef");

        System.out.println("--------- Zadanie 1 ----------");
        zadanie1(integerList);

        System.out.println("\n--------- Zadanie 2 ----------");
        zadanie2(integerList);

        System.out.println("\n--------- Zadanie 3 ----------");
        System.out.println(zadanie3(integerList));

        System.out.println("\n--------- Zadanie 4 ----------");
        System.out.println(zadanie4(stringList));
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

//    5. Tworzymy metodę zadanie5, która przyjmie za parametr listę Stringów, a która zwróci odpowiedź na pytanie, ile elementów ma nieparzystą liczbę znaków.
//    6. Tworzymy metodę zadanie6, która przyjmie za parametr zbiór Stringów, a która zwróci odpowiedź na pytanie, czy w zbiorze mamy łańcuch znaków, który kończy się na tekst "cde".
//    7. Tworzymy metodę zadanie7, która za parametr przyjmie listę Stringów, a zwróci zbiór, zawierający elementy tej listy.
//    8. Tworzymy metodę zadanie8, która za parametr przyjmie zbiór Stringów, a zwróci listę, zawierającą elementy tego zbioru.
//    9. Tworzymy metodę zadanie9, która za parametr przyjmie listę stringów, a zwróci listę zawierającą długości elementów argumentu.
//    10. Tworzymy metodę zadanie10, która za parametr przyjmie listę łańcuchów znaków, a która zwróci zbiór obiektów typu Pair (tworzonego wcześniej), którego lewy element to łańcuch znaków, który wystąpił w liście, a prawy to liczba wystąpień tego łańcucha.
//    11. Tworzymy klasę Converter, która będzie typem generycznym, która będzie miała w generyczny sposób napisane metody z zadań 7 oraz 8 (nazwijmy je toSet oraz toList).
//    12. W klasie Converter zamieniamy metody na statyczne metody generyczne (googlujemy).
//    13. Napisz metodę, która przyjmie jako argument listę łańcuchów znaków - nazw drużyn. Metoda zwróci listę zbiorów par (obydwa elementy pary to łańcuchy znaków - nazwy drużyn). Każdy kolejny element listy będzie reprezentował spotkania rozgrywane w kolejce rozgrywek. W jednej kolejce jedna drużyna może zagrać tylko raz, każda drużyna ma zagrać z każdą inną drużyną raz oraz najlepiej, aby w każdej kolejce było jak najwięcej meczów.
}
