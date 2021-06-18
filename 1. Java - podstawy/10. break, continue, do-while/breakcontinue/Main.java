package breakcontinue;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                // Instrukcja continue sprawia, że kończymy aktualny przebieg pętli.
                continue;
            }
            if (i == 20) {
                // Instrukcja break sprawia, że kończymy działanie pętli.
                break;
            }
            System.out.println(i);
        }
    }
}
