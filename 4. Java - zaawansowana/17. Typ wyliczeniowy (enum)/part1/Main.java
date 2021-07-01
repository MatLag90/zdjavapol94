package pl.sdacademy.enumerative.part1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.SATURDAY;
        System.out.println("Czy do zmiennej weekDay jest przypisana sobota: " + (weekDay == WeekDay.SATURDAY));
        System.out.println("Czy do zmiennej weekDay jest przypisana sobota: " + weekDay.equals(WeekDay.SATURDAY));

        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Dzień roboczy");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
        }

        WeekDay[] weekDays = WeekDay.values();
        System.out.println("\nWszystkie instancje typu WeekDay:");
        Arrays.stream(weekDays)
                .forEach(wd -> System.out.println(wd));
    }
}
