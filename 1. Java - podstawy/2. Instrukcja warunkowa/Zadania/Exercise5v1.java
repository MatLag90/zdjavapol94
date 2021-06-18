public class Exercise5v1 {
    public static void main(String[] args) {
//        5. Zadeklaruj trzy zmienne liczbowe (całkowite) i przypisz im wartości.
//        Następnie wypisz wartość największej z nich.
        int x = 5;
        int y = 5;
        int z = 8;

        if (x > y) {
            // x jest większy od y, czyli y nie jest największy
            // - pomijamy y w dalszych rozważaniach
            if (x > z) {
                System.out.println(x);
            } else {
                System.out.println(z);
            }
        } else {
            // x nie jest większy od y, czyli y jest większy, lub równy x
            // - pomijamy x w dalszych rozważaniach
            if (y > z) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        }
    }
}
