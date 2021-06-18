package whileloop;

import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
//        4. Stwórz program, który wypisze w konsoli 10 losowych
//        wartości z zakresu 15 - 25.
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // random.nextInt(11)   - losowanie wartości od 0 do 10
            // dodajemy 15, żeby "wskoczyć" w zadany zakres.
            int value = random.nextInt(11) + 15;
            System.out.println(value);
        }
    }
}
