package pl.sdacademy.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("------------ Zadanie 1 -------------");
        System.out.println("printFile(\"dane.txt\"):");
        System.out.println("Wynik wywołania metody: " + printFile("dane.txt"));

        System.out.println("\nprintFile(\"nieistniejacyplik.txt\"):");
        System.out.println("Wynik wywołania metody: " + printFile("nieistniejacyplik.txt"));

        System.out.println("\n------------ Zadanie 2 -------------");
        saveToFile("abc.txt", Arrays.asList("CCC", "DDD"), true);
    }

    //    1. Stwórz plik dane.txt, w którym zapisz kilka linijek tekstem.
//    Napisz metodę printFile, która za parametr przyjmie łańcuch znaków
//    - nazwę pliku, którego wszystkie linie zostaną wypisane.
//    Jeśli plik nie istnieje, to metoda zwróci w wyniku wartość false,
//    w innym wypadku zwróci true.
    private static boolean printFile(String filename) {
        Path filePath = Paths.get(filename);
        try {
            List<String> fileLines = Files.readAllLines(filePath);
            System.out.println(fileLines);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    //    2. Stwórz metodę saveToFile, która za parametr przyjmie nazwę pliku,
//    listę stringów (wiesze, które chcemy zapisać) oraz informację, czy dane
//    pliku chcemy nadpisać. Po napisaniu metody działającej dla istniejącego pliku,
//    dopisujemy kod, który sprawi, że metoda zadziała również w przypadku, kiedy
//    zadany plik nie istnieje.
    private static void saveToFile(String filename, List<String> fileLines, boolean overwrite) {
        Path filePath = Paths.get(filename);
        try {
            if (overwrite) {
                Files.write(filePath, fileLines);
            } else {
                Files.write(filePath, fileLines, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
