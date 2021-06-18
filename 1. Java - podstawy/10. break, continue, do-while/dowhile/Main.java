package dowhile;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x;
        // Pętla do-while zawsze wykona co najmniej jeden przebieg.
        do {
            // losujemy wartość z przedziału 0-99 (bez 100)
            x = random.nextInt(100);
        } while (x < 90); // działamy póki x jest mniejszy od 90 (pierwszy raz warunek jest sprawdzany
        // po pierwszym przebiegu pętli!
        System.out.println(x);
    }
}
