package innertypes;

public class Bicycle {
    private boolean damaged; // = false;

    @Override
    public String toString() {
        return "Bicycle{" +
                "damaged=" + damaged +
                '}';
    }

    // Wewnętrzne klasy mogą odwoływać się do prywatnych pól klasy zewnętrznej.
    // Obiekty klasy statycznej tworzymy analogicznie do obiektów dotychczas tworzonych klas.
    public static class RepairShop {
        private String name;

        public RepairShop(String name) {
            this.name = name;
        }

        public void repair(Bicycle bicycle) {
            System.out.println(name + " naprawia rower");
            // Zwracamy uwagę na to, że możemy się odwołać do pola prywatnego, wszak
            // jesteśmy dalej w ciele klasy Bicycle.
            bicycle.damaged = false;
        }
    }

    // Instancje niestatycznej klasy wewnętrznej będa związane z konkretnym obiektem typu zewnętrznego.
    // Koło będziemy mogli utworzyć w kontekście istniejącego roweru. Czyli potrzebujemy wcześniej utworzyć
    // rower, żeby następnie utworzyć koło w jego kontekście.
    public class Wheel {
        private int diameter;

        public Wheel(int diameter) {
            this.diameter = diameter;
        }

        public void damage() {
            System.out.println("Koło o średnicy " + diameter + " zostaje uszkodzone");
            // Odwołamy się do pola klasy zewnętrznej obiektu, w kontekście którego koło zostało
            // utworzone..
            damaged = true;
//          Inaczej:  Bicycle.this.damaged = true;
        }
    }
}
