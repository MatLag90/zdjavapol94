package pl.sdacademy.generics.exercises;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Zadanie 1 ----------");
        Pair<Boolean, String> pair1 = new Pair<>(true, "Aaaaa");
        boolean left = pair1.getLeft();
        System.out.println(left);
        String right = pair1.getRight();
        System.out.println(right);

        System.out.println("\n--------- Zadanie 2 ----------");
        List<String> stringList1 = new List<>("Gliwice", "Łódź", "Rzeszów");
        System.out.println("Wartość elementu o indeksie 1: " + stringList1.get(1));
        System.out.println("Lista: " + stringList1);
        System.out.println("Liczba elementów: " + stringList1.size());

        System.out.println("\nPrzebiegnięcie przez indeksy elementów");
        for (int i = 0; i < stringList1.size(); i++) {
            System.out.println("Index: " + i + ", wartość: " + stringList1.get(i));
        }

        System.out.println("Pierwszy element: " + stringList1.getFirst());
        System.out.println("Ostatni element: " + stringList1.getLast());

        stringList1.set(0, "Zabrze");
        System.out.println("Nowa wartość pierwszego elementu: " + stringList1.getFirst());

        System.out.println("Czy lista zawiera tekst Rzeszów? " + stringList1.contains("Rzeszów"));
        System.out.println("Czy lista zawiera tekst Warszawa? " + stringList1.contains("Warszawa"));

        stringList1.add("Poznań");
        System.out.println("Lista po dodaniu elementu Poznań: " + stringList1);

        System.out.println("\nPrzykłady dla List<Integer>");
        List<Integer> integerList = new List<>(5, 1);
        System.out.println("Lista: " + integerList);
        integerList.add(7);
        System.out.println("Lista po dodaniu elementu 7: " + integerList);
    }
}
