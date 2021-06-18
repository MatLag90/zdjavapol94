package text;

public class Main {
    public static void main(String[] args) {
        // Typ char reprezentuje znak. Znaki zapisujemy w apostrofach.
        // Zadeklarujemy zmienną typu char o nazwie myCharVariable
        // i przypiszemy jej wartość - znak 'a'.
        char myCharVariable = 'a';
        System.out.println("Wartość zmiennej myCharVariable: " + 'a');

        // Znaki to tak naprawdę wartości liczbowe (któremu znakowi odpowiada jaka wartość możemy sprawdzić pod linkiem:
        // http://www.asciitable.com/ - kolumny dec i Char).
        // Znak 'a' to 97. Przypiszemy zmiennej wartość 97.
        myCharVariable = 97;
        System.out.println("Wartość zmiennej myCharVariable to dalej: " + 'a');
        System.out.println("Czy litera 'a' to to samo, co 97? " + ('a' == 97));

        // Długość tekstu możemy uzyskać za pomocą metody .length()
        System.out.println("Długość tekstu abcde: " + "abcde".length());
        String text = "xyz";
        // Długość tekstu to wartośc liczbowa (typu int). Możemy w takim razie ją przypisać do zmiennej tego typu
        int textLength = text.length();
        System.out.println("Długość tekstu przypisanego do zmiennej text: " + textLength);

        // Znak dla zadanego indeksu (miejsca) uzyskamy za pomocą metody .charAt(...)
        // w nawiasach podajemy indeks znaku.
        System.out.println("Trzeci znak (o indeksie 2) z tekstu Klawiatura: " + "Klawiatura".charAt(2));

        // Wybierzemy pierwszy znak (czyli o indeksie 0) z tekstu przypisanego do zmiennej text.
        // Przypiszemy go do zmiennej firstCharacter
        char firstCharacter = text.charAt(0);
        System.out.println("Pierwszy znak tekstu przypisanego do zmiennej text: " + firstCharacter);

        // Indeks ostatniego znaku tekstu to długość tego tekstu minus 1.
        int lastCharacterIndex = text.length() - 1;
        System.out.println("Indeks ostatniego znaku tekstu przypisanego do zmiennej text: "
                + lastCharacterIndex);
        System.out.println("Ostatni znak tekstu przypisanego do zmiennej text: "
                + text.charAt(lastCharacterIndex));
    }
}
