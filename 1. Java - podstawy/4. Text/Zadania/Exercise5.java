package text;

public class Exercise5 {
    public static void main(String[] args) {
//        5. Zadeklaruj zmienną tekstową i przypisz jej wartość.
//        Wypisz wszystkie znaki wartości tej zmiennej w osobnych wierszach.
        String text = "jakiś tam tekst";

//        System.out.println(text.charAt(0));
//        System.out.println(text.charAt(1));
//        System.out.println(text.charAt(2));
//        System.out.println(text.charAt(3));
//        System.out.println(text.charAt(4));
//        ....
//        System.out.println(text.charAt(indeks ostatniego znaku));

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
