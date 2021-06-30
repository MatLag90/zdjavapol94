package pl.sdacademy.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("scannerReadExample()");
        scannerReadExample();
        System.out.println("\ntryWithResourcesExample()");
        tryWithResourcesExample();
        System.out.println("\nfilesReadExample()");
        filesReadExample();
        System.out.println("\nfilesWriteExample() - zapisze wiersze do pliku abc.txt");
        filesWriteExample();
        System.out.println("filesAppendExample() - doda wiersze do pliku abc.txt");
        filesAppendExample();
    }

    private static void scannerReadExample() throws IOException {
        // Tworzymy strumień wejściowy pracujący na bajtach czytanych z pliku.
        FileInputStream fileInputStream = new FileInputStream("abc.txt");
        // Utworzymy skaner analogicznie jak ten do odczytu danych z konsoli.
        // W tym wypadku jednak konstruktorowi przekażemy odwołanie do strumienia danych z pliku.
        Scanner scanner = new Scanner(fileInputStream);
        // Póki skaner ma wiersze do odczytania
        while (scanner.hasNextLine()) {
            // odczytamy wiersz i wypiszemy go w konsoli.
            System.out.println(scanner.nextLine());
        }
        // Gdy pracujemy z zasobami, dobrą praktyką jest zamykać obiekty z nich korzystające.
        // Służy do tego metoda close (takie obiekty na pewno oferują tę metodę, bo implementują interfejs
        // AutoCloseable, który wymusi jej implementację).
        scanner.close();
        fileInputStream.close();
    }

    private static void tryWithResourcesExample() {
        // Przykład scannerReadExample2 można od 7 wersji Javy znacznie uprościć.
        // Wyrażenie try-with-resources wygląda następująco:
        // po słówku try w nawiasach okrągłych tworzymy obiekty, po których chcemy posprzątać (muszą
        // implementować interfejs AutoCloseable). Dzięki temu niezależnie od tego, co się dalej stanie,
        // na pewno jeśli będzie się dało, będzie wywołana ich metoda close.
        // Zapis jest znacznie czytelniejszy.
        try (FileInputStream fileInputStream = new FileInputStream("abc.txt");
             Scanner scanner = new Scanner(fileInputStream)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Przykład odczytu wierszy z pliku przy użyciu metody klasy Files.
    private static void filesReadExample() throws IOException {
        // Utworzymy obiekt klasy Path reprezentujący ścieżkę pliku.
        Path filePath = Paths.get("abc.txt");
        // Odczytamy wiersze z pliku za pomocą metody statycznej readAllLines klasy Files.
        // Klasa Files została wprowadzona w 7 wersji Javy. Oferuje bogaty zestaw metod
        // wygodnych, gdy pracujemy z systemem plików.
        List<String> fileLines = Files.readAllLines(filePath);
        System.out.println(fileLines);
    }

    // Przykład zapisu wierszy do pliku przy użyciu metody klasy Files.
    private static void filesWriteExample() throws IOException {
        Path filePath = Paths.get("abc.txt");
        // Utworzymy listę wierszy do zapisania w pliku.
        List<String> fileLines = Arrays.asList("AAAA", "BBBB", "CCCC");
        // Zapiszemy wiersze w pliku o zadanej ścieżce. Jeśli w pliku są już jakieś zapisane
        // wiersze, to je nadpiszemy.
        Files.write(filePath, fileLines);
    }

    // Przykład dodania wierszy do pliku.
    private static void filesAppendExample() throws IOException {
        Path filePath = Paths.get("abc.txt");
        // Utworzymy listę wierszy do dopisania do pliku.
        List<String> newFileLines = Arrays.asList("DDDD", "EEEE");
        // Przekażemy metodzie write dodatkowy argument - wartość StandardOpenOption.APPEND,
        // która sprawi, że do pliku wiersze będą dopisywane.
        Files.write(filePath, newFileLines, StandardOpenOption.APPEND);
    }
}
