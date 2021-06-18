package pl.sdacademy.drink;

public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink(1000, "Woda źródlana", true);
        System.out.println("----------- Zadanie 1 -------------");
        System.out.println("Nazwa: " + drink1.getName());
        System.out.println("Objętość: " + drink1.getVolume());
        System.out.println("Czy gazowany: " + drink1.isSparkling());

        System.out.println("\n----------- Przykład automatycznego użycia metody toString -------------");
        // Patrz metoda toString w klasie Drink.
        System.out.println(drink1);

        System.out.println("\n----------- Zadanie 2 -------------");
        System.out.println("Zmieniam objętość napoju na 700");
        drink1.setVolume(700);
        System.out.println("Nowa objętość napoju: " + drink1.getVolume());

        System.out.println("\n----------- Zadanie 3 -------------");
        System.out.println("Piję 300 ml napoju");
        drink1.drink(300);
        System.out.println("Nowa objętość napoju: " + drink1.getVolume());

        System.out.println("\n----------- Zadanie 4 -------------");
        System.out.println("Próbuję wypić 500 ml napoju");
        drink1.drink(500);
        System.out.println("Nowa objętość napoju: " + drink1.getVolume());
    }
}
