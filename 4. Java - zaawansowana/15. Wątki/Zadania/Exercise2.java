package pl.sdacademy.thread.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    //    2. Napisz program, w którym użytkownik może dodawać elementy do listy
//    tekstów. Program automatycznie co 10 sekund wypisuje zawartość listy.
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        Thread thread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String newElement = scanner.nextLine();
                stringList.add(newElement);
            }
        });
        thread.start();

        while (true) {
            System.out.println("Zawartość listy: " + stringList);
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
