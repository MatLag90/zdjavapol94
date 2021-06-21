package pl.sdacademy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringList stringList1 = new StringList("Gliwice", "Łódź", "Rzeszów");
        System.out.println("Wartość elementu o indeksie 1: " + stringList1.get(1));
        System.out.println("Lista: " + stringList1);
        System.out.println("Liczba elementów: " + stringList1.size());

        System.out.println("\nPrzebiegnięcie przez indeksy elementów");
        for (int i = 0; i < stringList1.size(); i++) {
            System.out.println("Index: " + i + ", wartość: " + stringList1.get(i));
        }

        System.out.println("\n------- Zadanie 1 ---------");
        System.out.println("Pierwszy element: " + stringList1.getFirst());
        System.out.println("Ostatni element: " + stringList1.getLast());

        System.out.println("\n------- Zadanie 2 ---------");
        stringList1.set(0, "Zabrze");
        System.out.println("Nowa wartość pierwszego elementu: " + stringList1.getFirst());

        System.out.println("\n------- Zadanie 3 ---------");
        System.out.println("Czy lista zawiera tekst Rzeszów? " + stringList1.contains("Rzeszów"));
        System.out.println("Czy lista zawiera tekst Warszawa? " + stringList1.contains("Warszawa"));

        System.out.println("\n------- Zadanie 4 ---------");
        stringList1.add("Poznań");
        System.out.println("Lista po dodaniu elementu Poznań: " + stringList1);
    }
}
