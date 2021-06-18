package pl.sdacademy.guitar;

public class Main {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(true, 6, true, "Gibson");
        System.out.println("Producent: " + guitar1.getManufacturer());
        System.out.println("Czy elektryczna: " + guitar1.isElectric());
        System.out.println("Czy nastrojona: " + guitar1.isTuned());
        System.out.println("Liczba strun: " + guitar1.getStringCount());
        System.out.println(guitar1);

        System.out.println("\nGramy na gitarze:");
        guitar1.play();
    }
}
