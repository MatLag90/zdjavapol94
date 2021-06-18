package classes.accessmodifiers.somepackage;

public class B {
    public static void main(String[] args) {
        A a = new A();
        // W przypadku prywatnego modyfikatora dostępu możemy odwołać się do takiego pola jedynie w klasie,
        // w której takie pole zostało zadeklarowane. Poniższa instrukcja powodowałaby w takim razie błąd.
//        a.x = 1;
        // Możemy natomiast odwołać się do pola z domyslnym modyfikatorem dostępu
        a.y = 1;
        // oraz publicznym.
        a.z = 1;
    }
}
