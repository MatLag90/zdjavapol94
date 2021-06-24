package pl.sdacademy.generics.exercises;

import java.util.Arrays;

// E - typ elementów listy
public class List<E> {
    private E[] elements;

    public List(E... elements) {
        this.elements = elements;
    }

    public E get(int index) {
        return elements[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public int size() {
        return elements.length;
    }

    public E getFirst() {
        return elements[0];
    }

    public E getLast() {
        return elements[elements.length - 1];
    }

    public void set(int index, E element) {
        elements[index] = element;
    }

    public boolean contains(E value) {
        for (E element : elements) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }

    // Wersja 1 (gorsza):
//    public void add(E element) {
//        E[] newElements = (E[]) new Object[elements.length + 1];
//        for (int i = 0; i < elements.length; i++) {
//            newElements[i] = elements[i];
//        }
//        elements = newElements;
//        elements[elements.length - 1] = element;
//    }

    // Wersja 2:
    public void add(E element) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;
    }
}
