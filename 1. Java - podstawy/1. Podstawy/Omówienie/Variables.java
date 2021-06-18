public class Variables {
    public static void main(String[] args) {
        // Deklaracja zmiennej, to określenie, że od teraz w naszym kodzie będziemy używali zmiennej.
        // Deklaracja zmiennej składa się z jej !!!TYPU oraz NAZWY!!!!!.
        // Jeśli chcemy użyć zmiennej do przechowywania wartości będącej liczbą całkowitą, możemy użyć typu int.
        // W tym wypadku deklarujemy zmienną typu int o nazwie myIntVariable.
        int myIntVariable;
        System.out.println("Przypisujemy do zmiennej myIntVariable wartość 123");
        // Przypiszemy jej wartość 123
        // Operator = to operator przypisania - bierzemy to, co jest po prawej stronie i
        // przypisujemy zmiennej po lewej stronie.
        myIntVariable = 123;
        System.out.println("Wartość zmiennej myIntVariable: " + myIntVariable);

        System.out.println("Przypisujemy do zmiennej myIntVariable wartość 10");
        myIntVariable = 10;
        System.out.println("Wartość zmiennej myIntVariable: " + myIntVariable);

        System.out.println("Przypisujemy do zmiennej myIntVariable wartość 2 + 3");
        myIntVariable = 2 + 3;
        System.out.println("Wartość zmiennej myIntVariable: " + myIntVariable);

        System.out.println("Powiększamy wartość zmiennej myIntVariable o 3");
        // Operator += powiększa wartość przypisaną do zmiennej (lewego argumentu) o wartość prawego argumentu.
        myIntVariable += 3;
        // Jest to analogia do instrukcji:
        // myIntVariable = myIntVariable + 3;
        System.out.println("Wartość zmiennej myIntVariable: " + myIntVariable);

        // Analogicznie mamy instrukcje pomniejszające wartośc zmiennej:
//        myIntVariable -= 2;
//        czyli inaczej: myIntVariable = myIntVariable - 2;

        // Analogicznie mamy instrukcje mnożące wartośc zmiennej:
//        myIntVariable *= 5;
//        czyli inaczej: myIntVariable = myIntVariable * 5;

        // I dzielące:
//        myIntVariable /= 2;
//        czyli inaczej: myIntVariable = myIntVariable / 2;

        System.out.println("Zwiększamy wartość zmiennej myIntVariable o 1");
        myIntVariable++; // inaczej: myIntVariable = myIntVariable + 1;
        System.out.println("Wartość zmiennej myIntVariable: " + myIntVariable);

        // Możemy łączyć instrukcję deklaracji zmiennej i przypisania jej wartości
        int x = 5;
        // Czyli inaczej dwie poniższe instrukcje:
        // int x;
        // x = 5;
        System.out.println("\nWartość przypisana zmiennej x: " + x);

        // Typ String (z dużej litery!) reprezentuje typ wartości tekstowych.
        // Wartości tekstowe nazywamy łańcuchami znaków.
        String myStringVariable = "Mój tekst";
        System.out.println("\nWartość zmiennej myStringVariable: " + myStringVariable);
        myStringVariable += " z dopiskiem"; // inaczej:  myStringVariable = myStringVariable + " z dopiskiem";
        System.out.println("Wartość zmiennej myStringVariable: " + myStringVariable);
    }
}
