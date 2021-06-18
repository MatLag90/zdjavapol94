package forloop;

public class Exercise5 {
    public static void main(String[] args) {
//        5. Podaj sumę wszystkich liczb z przedziału 1 - 50 (skorzystaj z pętli for).
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println(sum);
    }
}
