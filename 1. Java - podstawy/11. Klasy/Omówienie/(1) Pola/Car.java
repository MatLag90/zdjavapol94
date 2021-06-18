package classes.fields;

// Klasa to reprezentacja wycinka rzeczywistości, przenoszonego do naszej aplikacji.
// To opis pojęcia, a nie konkretnego obiektu (inaczej: instancji lub wystąpienia).
// Klasy definiujemy w sposób:
// <<modyfikator dostępu>> class <<NazwaKlasy>> {
//     // tutaj definicja (ciało) klasy
// }
// Poniższa klasa reprezentuje w naszej aplikacji Samochód.
public class Car {
//    Pola (właściwości) klasy deklarujemy analogicznie do zmiennych:
//    <<typ>> <<nazwaPola>>
//    Pole to zmienna zarezerwowana osobno dla każdego jednego obiektu tego typu.
//    Każdy utworzony obiekt (w tym wypadku samochód) będzie miał osobno zarezerwowane miejsce pamięci dla
//    każdego z pól.

    //    To pole reprezentuje model samochodu.
    String model;
    //    Poniższe pole reprezentuje jego prędkość.
    int speed;
}
