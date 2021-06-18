package forloop;

public class Exercise7 {
    public static void main(String[] args) {
//        7. Dla liczb z przedziału 0 - 100 podaj informację, czy są podzielne przez 2, 3 i 5,
//        w (dokładnie) następujący sposób:
//            0, podzielne przez 2, podzielne przez 3, podzielne przez 5
//            1
//            2, podzielne przez 2
//            3, podzielne przez 3
//            4, podzielne przez 2
//            5, podzielne przez 5
//            6, podzielne przez 2, podzielne przez 3
//            7
//            8, podzielne przez 2
//            9, podzielne przez 3
//            10, podzielne przez 2, podzielne przez 5
//            ...

        // Wersja 1:
//        for (int i = 0; i <= 100; i++) {
//            String output = "" + i;
//            if (i % 2 == 0) {
//                output += ", podzielne przez 2";
//            }
//            if (i % 3 == 0) {
//                output += ", podzielne przez 3";
//            }
//            if (i % 5 == 0) {
//                output += ", podzielne przez 5";
//            }
//            System.out.println(output);
//        }

        // Wersja 2:
        for (int i = 0; i <= 100; i++) {
            System.out.print(i);
            if (i % 2 == 0) {
                System.out.print(", podzielne przez 2");
            }
            if (i % 3 == 0) {
                System.out.print(", podzielne przez 3");
            }
            if (i % 5 == 0) {
                System.out.print(", podzielne przez 5");
            }
            // Znak złamania wiersza:
            System.out.println();
        }
    }
}
