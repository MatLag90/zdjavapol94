package pl.sdacademy;

import java.util.Arrays;

public class StringList {
    private String[] elements;

    public StringList(String... elements) {
        this.elements = elements;
    }

    public String get(int index) {
        return elements[index];
    }

    public String toString() {
        // Metoda statyczna toString z klasy Arrays "przerabia" tablicę na tekst.
        return Arrays.toString(elements);
    }

    public int size() {
        return elements.length;
    }

    //    1.  Dodaj do klasy StringList metody getFirst oraz getLast zwracające
//    odpowiednio pierwszy oraz ostatni element.
    public String getFirst() {
        return elements[0];
    }

    public String getLast() {
        return elements[elements.length - 1];
    }

    //    2.  Dodaj dwuparametrową metodę set. Pierwszy parametr będzie indeksem,
//    drugi wartością. Metoda ustawi zadaną wartość elementowi o wskazanym indeksie.
    public void set(int index, String element) {
        elements[index] = element;
    }

//    3.  Dodaj metodę contains, która zwróci odpowiedź na pytanie, czy lista zawiera
//    przekazany argument.
    public boolean contains(String value) {
        for (String element : elements) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }

//    4.  Dodaj do klasy StringList metodę add, która posłuży do dodawania elementu.
    // Wersja 1 (gorsza):
//    public void add(String element) {
//        String[] newElements = new String[elements.length + 1];
//        for (int i = 0; i < elements.length; i++) {
//            newElements[i] = elements[i];
//        }
//        elements = newElements;
//        elements[elements.length - 1] = element;
//    }

    // Wersja 2:
    public void add(String element) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;
    }
}
