package pl.sdacademy.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Klasa LocalDate reprezentuje pojęcie daty (z uwzględnieniem strefy czasowej).
        // Utworzymy zadaną datę.
        LocalDate date = LocalDate.of(2021, 6, 16);
        System.out.println(date);
        // Przykładowe użycie metody obiektu klasy LocalDate - dodamy 20 dni do daty i otrzymamy nową datę.
        LocalDate newDate = date.plusDays(20);
        System.out.println(newDate);

        // Analogicznie, klasa LocalTime reprezentuje zadany czas (lokalny).
        LocalTime time = LocalTime.of(12, 41);
        System.out.println(time);

        // Klasa LocalDateTime jest połączeniem dwóch wcześniej zaprezentowanych typów - reprezentuje datę oraz czas.
        LocalDateTime dateTime = LocalDateTime.of(date, time);
//        LocalDateTime dateTime = LocalDateTime.of(2021, 6, 16, 12, 41);
        System.out.println(dateTime);

        // Przykład formatowania daty/czasu wedle zadanego przez siebie formatu.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(date.format(formatter));

        // Metody statyczne now zaprezentowanych typów zwracają wartość z chwili obecnej.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
    }
}
