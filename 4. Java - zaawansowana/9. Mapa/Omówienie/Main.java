package pl.sdacademy.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Mapa to interfejs, który oferuje metody służące do obsługi obiektu typu słownikowego, czyli takiego
        // "w którym" przechowujemy pary klucz -> wartość.
        // Klasa HashMap implementuje interfejs Map. Jest to implementacja, podobnie jak HashSet, korzystająca
        // z hashCode'u obiektów. Inną implementacją, analogiczną do TreeSet będzie TreeMap. TreeMap porządkuje
        // pary klucz wartość na bazie kluczy.
        // Interfejs map jest interfejsem generycznym. Pierwszy typ sparametryzowany to typ kluczy, a drugi wartości.
        // Zadeklarujemy zmienną o nazwie plToEngDictionary, który będzie mapą, której zarówno klucze jak i wartości
        // to łańcuchy znaków. Utworzymy nową instancję typu HashMap i przypiszemy zmiennej.
        Map<String, String> plToEngDictionary = new HashMap<>();
        // Parę klucz -> wartość dodajemy za pomocą metody put.
        plToEngDictionary.put("dom", "house");
        plToEngDictionary.put("kot", "cat");
        plToEngDictionary.put("pies", "dog");
        System.out.println(plToEngDictionary);
        // Przy wstawianiu do mapy pary klucz->wartość dla istniejącego już klucza nadpiszemy wartość dla tego klucza.
        plToEngDictionary.put("dom", "home");
        System.out.println("Mapa po modyfikacji wartości dla klucza \"dom\": " + plToEngDictionary);

        // Wartość dla zadanego klucza wybieramy za pomocą metody get.
        System.out.println(plToEngDictionary.get("kot"));
        // Metoda containsKey zwraca informację, czy mapa zawiera zadany klucz.
        System.out.println(plToEngDictionary.containsKey("pies"));
        // Metoda remove służy do usuwania pary klucz wartość. W tym wypadku usuniemy parę klucz wartość
        // dla klucza "kot".
        plToEngDictionary.remove("kot");
        System.out.println("Mapa po usunięciu pary dla klucza \"kot\"\n: " + plToEngDictionary);

        // Metoda keySet zwróci zbiór kluczy.
        Set<String> keySet = plToEngDictionary.keySet();
        System.out.println(keySet);

        // Metoda values zwraca kolekcję wartości z mapy.
        Collection<String> values = plToEngDictionary.values();
        System.out.println(values);

        System.out.println("\nPrzebiegnięcie w pętli przez pary klucz wartość:");
        // Metoda entrySet zwróci zbiór obiektów typu Map.Entry (typ generyczny reprezentujący konkretną parę
        // klucz -> wartość).
        Set<Map.Entry<String, String>> entries = plToEngDictionary.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            // metody getKey i getValue obiektu typu Map.Entry zwracają odpowiednio klucz i wartość z pary.
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
