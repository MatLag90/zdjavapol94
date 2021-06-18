package whileloop;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
//        2. Stwórz program, który poprosi użytkownika o podanie dwóch
//        wartości - długości boków prostokąta. Następnie wypisze pole
//        takiego prostokąta.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kolejno długości par boków prostokąta:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Prostokąt o takich bokach ma pole: " + a * b);
    }
}
