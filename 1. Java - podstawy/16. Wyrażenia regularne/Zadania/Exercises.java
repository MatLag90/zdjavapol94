package pl.sdacademy.regex;

public class Exercises {
    public static void main(String[] args) {
//        1. Sprawdź, czy tekst składa się z samych cyfr.
        System.out.println("---------- Zadanie 1 -----------");
        System.out.println("13451343".matches("\\d*"));
        System.out.println("".matches("\\d*"));
        System.out.println("1".matches("\\d*"));

//        2. Sprawdź, czy tekst składa się wyłącznie z małych znaków angielskiego alfabetu.
        System.out.println("\n---------- Zadanie 2 -----------");
        System.out.println("abargaerga".matches("[a-z]*"));

//        3. Zapisz łańcuch znaków, który pasuje do wyrażenia regularnego \\d+a*
        System.out.println("\n---------- Zadanie 3 -----------");
        System.out.println("1432aaaa".matches("\\d+a*"));
        System.out.println("5".matches("\\d+a*"));

//        4. Zapisz łańcuch znaków, który pasuje do wyrażenia regularnego 5?1?a+
        System.out.println("\n---------- Zadanie 4 -----------");
        System.out.println("a".matches("5?1?a+"));
        System.out.println("51aaa".matches("5?1?a+"));
        System.out.println("1aaa".matches("5?1?a+"));

//        5. Sprawdź, czy tekst składa się jedynie z samych znaków alfanumerycznych i białych znaków.
        System.out.println("\n---------- Zadanie 5 -----------");
        System.out.println("a 123\tXYZ\n5".matches("[a-zA-Z\\d\\s]*"));

//        6. Sprawdź, czy w tekście występuje cyfra.
        System.out.println("\n---------- Zadanie 6 -----------");
        System.out.println("are343gaergae2aerga".matches(".*\\d.*"));

//        7. Napisz wyrażenie regularne, które sprawdzi, czy tekst ma format XX.XX.XXXX, gdzie X to cyfry.
        System.out.println("\n---------- Zadanie 7 -----------");
        System.out.println("16.06.2021".matches("\\d\\d\\.\\d\\d\\.\\d\\d\\d\\d"));
        System.out.println("16.06.2021".matches("\\d{2}\\.\\d{2}\\.\\d{4}"));
        System.out.println("16.06.2021".matches("(\\d{2}\\.){2}\\d{4}"));

//        8. Sprawdź, czy w tekście nie występuje biały znak (nie może wystąpić).
//        9. Sprawdź, czy tekst jest numerem tablicy rejestracyjnej.
//        10. Sprawdź, czy łańcuch znaków to adres email.
//        11. Zastąp w tekście wszystkie cyfry tekstem "_tu_była_cyfra_X_", gdzie X to zastąpiona cyfra.
    }
}
