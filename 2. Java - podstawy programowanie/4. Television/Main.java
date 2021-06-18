package pl.sdacademy.tv;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- Pierwszy telewizor ------");
        Television television1 = new Television(20);
        System.out.println(television1);
        System.out.println("Włączam telewizor");
        television1.turnOn();
        System.out.println(television1);
        System.out.println("\n---- Drugi telewizor ------");
        Television television2 = new Television(10, 50, 3, true);
        System.out.println(television2);
    }
}
