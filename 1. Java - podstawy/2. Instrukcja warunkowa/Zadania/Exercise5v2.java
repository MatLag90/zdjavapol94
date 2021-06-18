public class Exercise5v2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int z = 8;

        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        System.out.println(max);
    }
}
