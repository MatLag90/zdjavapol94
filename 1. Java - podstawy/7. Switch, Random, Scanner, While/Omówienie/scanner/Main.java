package scanner;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Deklarujemy zmienną typu Scanner o nazwie myScanner, przypisujemy jej wartość
        // (dopowiemy później o co chodzi w wyrażeniu po prawej stronie instrukcji przypisania).
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        // Deklarujemy zmienną typu String o nazwie userInput. Następnie za pomocą metody nextLine scannera zaczytamy
        // wartość z konsoli, wprowadzoną przez użytkownika.
        String userInput = myScanner.nextLine();
        System.out.println("Użytkownik podał tekst: " + userInput);

        System.out.println("Podaj liczbę całkowitą:");
        // Metoda nextInt scannera zwróci liczbę całkowitą wpisaną przez użytkownika w konsoli.
        int userIntInput = myScanner.nextInt();
        System.out.println("Użytkownik podał liczbę całkowitą: " + userIntInput);
    }
}
