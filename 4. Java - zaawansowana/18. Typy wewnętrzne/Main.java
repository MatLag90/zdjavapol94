package innertypes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle);

        Bicycle.Wheel wheel = bicycle.new Wheel(20);
        wheel.damage();

        System.out.println(bicycle);

        Bicycle.RepairShop repairShop = new Bicycle.RepairShop("Mechanik XYZ");
        repairShop.repair(bicycle);

        System.out.println(bicycle);
    }
}
