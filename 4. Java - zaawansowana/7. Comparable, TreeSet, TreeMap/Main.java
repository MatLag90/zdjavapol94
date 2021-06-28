package pl.sdacademy.comparison;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Aby móc określić domyślne uporządkowanie wartości zadanego typu, ten typ będzie
        // implementował interfejs Comparable. Dzięki temu obiekty będą oferowały metodę
        // compareTo. Jeśli wywołanie metody zwróci wartość większą od 0, to znaczy, że obiekt
        // którego metodę wywołano jest większy. Jeśli zwróci 0, to znaczy że obydwa porównywane obiekty są równe,
        // a jeśli zwrócona wartość będzie mniejsza od 0, to znaczy, że argument był większy.
        // Klasa String jest jedną z klas, które implementują ten interfejs.
        System.out.println("abc".compareTo("xyz"));
        System.out.println("abc".compareTo("abc"));
        System.out.println("xyz".compareTo("abc"));

        // Utworzona przez nas klasa Car implementuje interfejs Comparable.
        Car car1 = new Car(123, "Fiat Panda");
        Car car2 = new Car(234, "Dacia Duster");
        System.out.println(car1.compareTo(car2));

        List<String> stringList = new ArrayList<>();
        stringList.add("wszystko");
        stringList.add("jedno");
        stringList.add("jakie");
        stringList.add("elementy");
        // Metoda statyczna sort z klasy Collections posortuje elementy listy.
        // Wykorzysta w tym celu metodę compareTo obiektów listy (żeby ustalić porządek).
        Collections.sort(stringList);
        System.out.println(stringList);

        // Klasa TreeSet jest implementacją zbioru, która porządkuje swoje elementy - domyślnie
        // wedle sposobu implementacji interfejsu Comparable elementów.
        // W tym wypadku typ elementów zbioru musi implementować interfejs Comparable.
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("jakieś");
        stringSet.add("elementy");
        stringSet.add("zbioru");
        stringSet.add("typu");
        stringSet.add("drzewiastego");
        System.out.println(stringSet);

        // Analogicznie klasa TreeMap - jest implementacją interfejsu Map, w której pary klucz-wartość
        // są przechowywane z uwzględnieniem porządku, bazującego na kluczu.
        Map<String, String> map = new TreeMap<>();
        map.put("ccc", "333");
        map.put("aaa", "111");
        map.put("bbb", "222");
        System.out.println(map);
    }
}
