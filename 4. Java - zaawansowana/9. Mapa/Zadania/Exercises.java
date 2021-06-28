package pl.sdacademy.map;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("--------- Zadanie 1 --------");
        exercise1();

        System.out.println("\n--------- Zadanie 2 --------");
        exercise2();

        System.out.println("\n--------- Zadanie 3 --------");
//        List<String> stringList = new ArrayList<>();
//        stringList.add("aaa");
//        stringList.add("bbb");
        List<String> stringList = Arrays.asList("aaa", "bbb");
        System.out.println(exercise3(stringList));

        System.out.println("\n--------- Zadanie 4 --------");
        Map<String, String> map = new HashMap<>();
        map.put("klucz1", "wartosc1");
        map.put("klucz2", "wartosc2");
        System.out.println(exercise4(map));
    }

    //    1. Utwórz i przypisz do zmiennej (capitalByCountry) mapę, która jako klucze
//    i wartości będzie przyjmowała łańcuchy znaków.
//    Wstaw do mapy pary wartości:
//    Polska -> Warszawa
//    Niemcy -> Berlin
//    Francja -> Paryż
//    Wypisz w konsoli wszystkie klucze z tej mapy
//    Wypisz w konsoli wszystkie wartości z tej mapy

    private static void exercise1() {
        Map<String, String> capitalByCountry = new HashMap<>();
        capitalByCountry.put("Polska", "Warszawa");
        capitalByCountry.put("Niemcy", "Berlin");
        capitalByCountry.put("Francja", "Paryż");
        // Wersja 1:
        System.out.println("Klucze z mapy: " + capitalByCountry.keySet());
        // Wersja 2:
        System.out.println("Klucze z mapy:");
        for (String key : capitalByCountry.keySet()) {
            System.out.println(key);
        }
        System.out.println("Wartości z mapy: " + capitalByCountry.values());
    }

//    2. Utwórz mapę, której kluczem będzie imię i nazwisko (łańcuch znaków),
//    a wartością średnia ocen. Wypisz imiona, nazwiska i średnią ocen wszystkich
//    osób w kolejnych wierszach. Następnie wypisz imiona i nazwiska osób, których
//    średnia jest większa niż 3.
    private static void exercise2() {
        Map<String, Double> avgGradeByFullName = new HashMap<>();
        avgGradeByFullName.put("Adam Adamowski", 3.5);
        avgGradeByFullName.put("Anna Annowska", 4.5);
        avgGradeByFullName.put("Jan Janowski", 4.5);
        avgGradeByFullName.put("Krzysztof Krzysztofowski", 2.8);

        System.out.println("Imiona, nazwiska i średnia ocen:");
        for (Map.Entry<String, Double> entry : avgGradeByFullName.entrySet()) {
            System.out.println("Osoba " + entry.getKey() + " ma średnią: " + entry.getValue());
        }
        System.out.println("\nImiona i nazwiska osób o średniej większej niż 3:");
        for (Map.Entry<String, Double> entry : avgGradeByFullName.entrySet()) {
            String fullName = entry.getKey();
            double avgGrade = entry.getValue();
            if (avgGrade > 3) {
                System.out.println(fullName);
            }
        }
    }

//    3. Tworzymy metodę, która za parametr przyjmie listę stringów,
//    a która zwróci w wyniku mapę, której klucze będą indeksami elementów
//    z listy, a wartościami będą elementy z listy.
//
//    Np. dla listy: [aaa, bbb] metoda zwróci mapę: { 0=aaa, 1=bbb }
    private static Map<Integer, String> exercise3(List<String> list) {
        Map<Integer, String> result = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            result.put(i, list.get(i));
        }
        return result;
    }

//    4. Tworzymy metodę, która za parametr przyjmie mapę, której klucze
//    oraz wartości to Stringi, a która zwróci mapę, która dla klucza "klucze"
//    będzie przechowywała listę kluczy, a dla klucza "wartosci" będzie
//    przechowywała listę wartości.
//    Np. dla mapy: {klucz1=wartosc1, klucz2=wartosc2} metoda zwróci:
//    {klucze=[klucz1, klucz2], wartosci=[wartosc1, wartosc2]}
    private static Map<String, List<String>> exercise4(Map<String, String> map) {
        List<String> keys = new ArrayList<>(map.keySet());
        List<String> values = new ArrayList<>(map.values());
        Map<String, List<String>> result = new HashMap<>();
        result.put("klucze", keys);
        result.put("wartosci", values);
        return result;
    }
//    5. Tworzymy metodę, która za parametr przyjmie zbiór stringów, a zwróci mapę, której kluczem będzie każdy łańcuch znaków z parametru (zbioru), a wartością będzie odpowiedź na to, ile dany łańcuch zawiera znaków "a".
//    6. Tworzymy metodę, która za parametr przyjmie listę stringów, która zwróci mapę, której kluczem będzie długość łańcucha znaków, a wartością będzie lista stringów, które mają taką długość.
//    7. Tworzymy metodę, która przyjmie dwa parametry - mapę <String, String> oraz listę <String>. Metoda zwróci odpowiedź, czy dla każdego elementu listy, mapa ma taką właściwość, że element jest albo kluczem, albo wartością (nie jednocześnie kluczem i wartością).
//    8. Tworzymy metodę, która za parametr przyjmie łańcuch znaków, a która w wyniku zwróci mapę, której kluczem będą litery, a której wartością będzie liczba wystąpień tej litery w zadanym łańcuchu znaków.
}
