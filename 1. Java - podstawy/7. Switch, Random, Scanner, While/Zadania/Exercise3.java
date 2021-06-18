package whileloop;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
//        3. Stwórz program, który będzie zadawał użytkownikowi pytanie
//        "Czy chcesz zakończyć działanie programu", póki odpowiada "nie".
//        Wygoogluj frazę "java String compare".
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy chcesz zakończyć działanie programu?");
        String userInput = scanner.nextLine();
        while (userInput.equals("nie")) {
            System.out.println("Czy może teraz chcesz zakończyć działanie programu");
            userInput = scanner.nextLine();
        }
        System.out.println("Kończymy działanie programu");
    }
}
