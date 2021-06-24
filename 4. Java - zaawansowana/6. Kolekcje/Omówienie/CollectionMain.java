package pl.sdacademy.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionMain {
    public static void main(String[] args) {
        // Interfejsy Set i List to interfejsy rozszerzające interfejs Collection.
        // Do zmiennej typu Collection możemy w takim razie przypisać np.
        // instancje typu ArrayList, HashSet.
        // Kolekcja to grupa elementów wybranego typu.
        Collection<String> collection1 = new ArrayList<>();
        // Interfejs Collection oferuje zestaw metod do pracy z grupami obiektów.
        collection1.add("aaa");
        collection1.add("bbb");
        collection1.add("ccc");
        collection1.add("ccc");
        System.out.println(collection1);
        System.out.println("Liczba elementów kolekcji: " + collection1.size());

        for (String element : collection1) {
            System.out.println(element);
        }
    }
}
