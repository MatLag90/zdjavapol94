package pl.sdacademy.exception.exercises;

import java.util.Arrays;

//4. Edytuj tworzoną przez nas klasę StringList - w przypadku odwoływania się do elementu
// o nieistniejącym indeksie powinien zostać wyrzucony wyjątek typu IndexOutOfBoundsException
// z odpowiednim komunikatem.
public class StringList {
    private String[] elements;

    public StringList(String... elements) {
        this.elements = elements;
    }

    public String get(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("Brak indeksu o wartości: " + index);
        }
        return elements[index];
    }

    public String toString() {
        return Arrays.toString(elements);
    }

    public int size() {
        return elements.length;
    }

    public String getFirst() {
        return elements[0];
    }

    public String getLast() {
        return elements[elements.length - 1];
    }

    public void set(int index, String element) {
        elements[index] = element;
    }

    public boolean contains(String value) {
        for (String element : elements) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void add(String element) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;
    }
}
