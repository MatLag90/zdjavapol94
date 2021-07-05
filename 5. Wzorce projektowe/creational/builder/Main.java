package creational.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .withHdd(2.5)
                .withPowerAdapter("600W")
                .withRam(8.)
                .withGraphicsCard("RTX2080")
                .build();
        System.out.println(computer);

        ///////////////////////////////

        Computer.Builder builder = new Computer.Builder();
        builder.withCpu(5.)
                .withRam(3.);
        if (true) {
            builder.withPowerAdapter("abc");
        }
        System.out.println(builder.build());

        ///////////////////////////////

        String string = new StringBuilder("a")
                .append("b")
                .append("c")
                .toString();
        System.out.println(string);

    }
}
