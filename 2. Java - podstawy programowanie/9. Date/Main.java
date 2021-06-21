package pl.sdacademy;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(21, 6, 2021);
        System.out.println(date1);
        System.out.println("Czy rok daty jest przestępny: " + date1.isLeapYear());
    }
}
