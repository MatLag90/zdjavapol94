public class Concatenation {
    public static void main(String[] args) {
        // Jeśli użyjemy operatora + w taki sposób, że co najmniej jeden z jego argumentó będzie
        // łańcuchem znaków (tekstem), to będzie on operatorem konkatenacji - sklejenia tekstów.
        System.out.println("ABC" + "DEF");
        // W poniższym przykładzie "123" i "456" są zapisane w cudzysłowach - są tekstami.
        System.out.println("123" + "456");
        // Inaczej byłoby, gdybyśmy użyli instrukcji poniższej - byłoby to dodawanie liczb.
//        System.out.println(123 + 456);
        // Jeśli jeden z argumentów nie będzie tekstem, to zostanie on skonwertowany do typu tekstowego,
        // a następnie teksty zostaną sklejone.
        System.out.println("ABC" + 123);
        System.out.println(987 + "XYZ");
        // Istotne jest wzięcie pod uwagę siły operatorów (* jest silniejsze od + i będzie wykonane
        // w pierwszej kolejności).
        System.out.println("A" + 2 * 2);
        System.out.println("A" + 2 + 2);
    }
}
