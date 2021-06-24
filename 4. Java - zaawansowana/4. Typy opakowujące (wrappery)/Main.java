package pl.sdacademy.wrappertypes;

public class Main {
    public static void main(String[] args) {
        // Każdy typ prymitywny posiada obiektowy odpowiednik - klasę.
        // Dla typu int jest to Integer, dla typu char jest to Character,
        // dla pozostałych typów prymitywnych nazwy klas są identyczne
        // (oczywiście pisane z dużej litery).
        // Java oferuje mechanizm automatycznego konwertowania wartości
        // z typu obiektoweo na prymitywny i odwrotnie. Mechanizm ten nazywamy
        // autoboxingiem.
        int myInt = 5;

        Integer myInteger;
        // Jako że zmienna jest typu obiektowego, to możemy przypisać do niej wartość null.
        myInteger = null;
        // Wykorzystamy autoboxing - automatyczną konwersję wartości typu int do wartości typu Integer.
        myInteger = 234; // po kompilacji mamy: myInteger = Integer.valueOf(234);

        // Analogicznie mamy unboxing:
        myInt = myInteger; // po kompilacji mamy: myInt = myInteger.intValue();

        // Inne obiektowe odpowiedniki prymitywów:
        Boolean myBoolean = true;
        Character myCharacter = 'a';
        Float myFloat = 123.34f;
        Double myDouble = 234.234;
        Byte myByte = 123;
        Short myShort = 2123;
        Long myLong = 2341234323453L;
    }
}
