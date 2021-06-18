package varargs;

public class VarargsMain {
    public static void main(String[] args) {
        // Metodę add możemy wywołać przekazując dowolną liczbę argumentów.
        System.out.println(add());
        System.out.println(add(5));
        System.out.println(add(2, 6));
        System.out.println(add(2, 6, 5, 234, 4653, 654, 234, 345, 3546, 65, 45, 43));

        int[] intArray = {4, 3, 1};
        // Metodę przyjmującą varargs możemy wywołać przekazując jej przy wywołaniu tablicę.
        System.out.println(add(intArray));
    }

    // Argument z wielokropkiem po nazwie typu argumentu będziemy nazywali varargs.
    // Możemy przekazać wtedy dowolną liczbę argumentów przy wywołaniu metody.
    // Varargs muszą być ostatnim parametrem metody.
    // Wartości argumentów zebrane są w tablicę - wartością parametru będzie
    // taka tablica, której kolejne elementy to argumenty przy wywołaniu metody.
    private static int add(int... args) {
        int result = 0;
        for (int arg : args) {
            result += arg;
        }
        return result;
    }
}
