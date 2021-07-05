package behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        Adult adult1 = new Adult();
        Adult adult2 = new Adult();
        FireFighter fireFighter = new FireFighter();

        System.out.println("\nPierwszy pożar:");
        child.setNext(adult1);
        adult1.setNext(adult2);
        adult2.setNext(fireFighter);

        child.handle(50);

        System.out.println("\nDrugi pożar:");
        child.setNext(fireFighter);
        child.handle(200);
    }
}
