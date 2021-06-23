package pl.sdacademy.interfaces;

public class Main {
    public static void main(String[] args) {
        // Nie można utworzyć instancji typu abstrakcyjnego (klasy abstrakcyjnej lub interfejsu).
//        Colored colored1 = new Colored();
        // Do zmiennej typu Colored możemy przypisać obiekt typu, który ten interfejs implementuje.
        Colored colored1 = new Paint("czerwony", 2);
        // O takim obiekcie, jako że jest typu implementującego ten interfejs wiemy tyle, że na pewno
        // implementuje metody interfejsu (metodę getColor w tym przypadku).
        System.out.println("Kolor farby: " + colored1.getColor());

        // Analogiczny przykład z obiektem typu Grass - klasa Grass również implementuje interfejs
        // Colored, więc instancję tego typu możemy przypisać do zmiennej o nazwie colorable.
        Colored colored2 = new Grass(123);
        System.out.println("Kolor trawy: " + colored2.getColor());
    }
}
