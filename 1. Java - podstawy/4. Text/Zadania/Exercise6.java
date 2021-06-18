package text;

public class Exercise6 {
    public static void main(String[] args) {
//        6. Zadeklaruj zmienną tekstową i przypisz jej wartość.
//        Podaj liczbę wystąpień litery "a" w tekście przypisanym do zmiennej.
        String text = "jakiś tam tekst";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Liczba wystąpień znaku 'a' w tekście \"" + text + "\":");
        System.out.println(count);
    }
}
