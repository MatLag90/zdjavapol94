package text;

public class Exercise1 {
    public static void main(String[] args) {
//        1. Zadeklaruj zmienną typu tekstowego - przypisz jej wartość tekstową
//        (na który składa się co najmniej 5 znaków). Wypisz w konsoli kolejno:
//        - jego długość
//        - wartość jego pierwszego znaku
//        - wartość jego 4 znaku
//        - indeks jego ostatniego znaku.
        String text = "jakiś tam tekst";

        System.out.println("Długość tekstu:");
        System.out.println(text.length());

        System.out.println("\nPierwszy znak:");
        System.out.println(text.charAt(0));

        System.out.println("\nCzwarty znak:");
        System.out.println(text.charAt(3));

        System.out.println("\nIndeks ostatniego znaku:");
        System.out.println(text.length() - 1);
    }
}
